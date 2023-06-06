package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies a video file
 * Uses FileInputStream and FileOutputStream with a buffer of 8192 bytes
 *
 * @author Ntirintis John
 */
public class FileIOStreamVideo {
    public static void main(String[] args) {
        // Create a byte array buffer with a size of 8192 bytes
        byte[] buffer = new byte[8192];
        int b = 0;
        int count = 0;

        try(FileInputStream fis = new FileInputStream("C:/tmp/v1.mp4");
            FileOutputStream fos = new FileOutputStream("C:/tmp/vout.mp4"))
        {
            // Read from the input stream into the buffer until the end of the file is reached
            while((b = fis.read(buffer)) != -1){
                // Write the data from the buffer into the output stream
                fos.write(buffer, 0, b);
                // Keep track of the number of bytes written
                count += b;
            }

            System.out.printf("%,.0f KBytes were written\n", Math.ceil((double) count / 1024));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

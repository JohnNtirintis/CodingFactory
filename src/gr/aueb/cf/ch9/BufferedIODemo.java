package gr.aueb.cf.ch9;

import java.io.*;

/**
 * A demonstration of buffered input/output operations in Java.
 * This program reads a video file using BufferedInputStream and writes it back using BufferedOutputStream.
 * It utilizes a buffer of size 8192 bytes for efficient reading and writing.
 *
 * @author Ntirintis John
 */
public class BufferedIODemo {
    public static void main(String[] args) {
        byte[] buffer = new byte[8192];
        int b = 0;
        int count = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/tmp/v-in.mp4"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/tmp/buffered-vout.mp4")))
        {
            // Read from the input stream until the end of the file is reached
            while((b = bis.read()) != -1){
                // Write the data from the buffer into the output stream
                bos.write(buffer, 0, b);
                // Keep track of the number of bytes written
                count += b;
            }

            System.out.printf("%,.0f KBytes were written \n", Math.ceil((double) count / 1024));

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

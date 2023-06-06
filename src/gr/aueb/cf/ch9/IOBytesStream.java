package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This app copies an image file and simultaneously
 * calculates the size of the file it copied
 *
 * @author Ntirintis John
 */
public class IOBytesStream {
    public static void main(String[] args) {
        // Copying a file byte to byte is not efficient because for every byte of the file,
        // there is a read/write system call to the SDD/HDD etc.
        // Thus it takes a lot of time
        // Copying with a buffer would have been much more efficient and it will be showcased in the next example
        try(FileInputStream in = new FileInputStream("C:/tmp/image.jpg");
            FileOutputStream out = new FileOutputStream("C:/tmp/image-copy.jpg"))
        {
            int b, count = 0;
            while ((b = in.read()) != -1){
                out.write(b);
                count++;
            }
            System.out.printf("The size of the image is: %d Kbytes (%d bytes) and it was copied successfully", count/1024, count);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

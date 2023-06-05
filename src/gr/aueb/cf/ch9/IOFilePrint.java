package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author Ntirintis John
 */
public class IOFilePrint {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/ps-example1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/pw-example1.txt"))
        {
            ps.println("Hello world from PS");
            pw.println("Hello world from PW");
        } catch ( FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}

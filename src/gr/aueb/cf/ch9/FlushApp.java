package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Showcases flush()
 *
 * @author Ntirintis John
 */
public class FlushApp {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("C:/tmp/flush-example1.txt");
            pw.print("hello");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

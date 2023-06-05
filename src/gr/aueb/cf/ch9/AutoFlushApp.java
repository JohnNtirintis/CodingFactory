package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Try-with-resources, showcases flush()
 *
 * @author Ntirintis John
 */
public class AutoFlushApp {
    public static void main(String[] args) {
        // Will auto-flush after it auto-closes
        try (PrintWriter pw = new PrintWriter("C:/tmp/auto-flush-example.txt")){
            pw.print("This is auto flush");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

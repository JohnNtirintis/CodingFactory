package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Showcases wrapper methods/classes and sets auto-flush to true
 *
 * @author Ntirintis John
 */
public class AutoFlushAppTwo {
    public static void main(String[] args) {
        // Wrapper class
        // auto-flush is set to true
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/fos.txt"), true)){
            ps.print("hello");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

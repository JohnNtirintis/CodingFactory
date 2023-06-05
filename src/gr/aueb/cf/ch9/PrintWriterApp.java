package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Prints text with PrintWriter.
 *
 * @author Ntirintis John
 */
public class PrintWriterApp {
    public static void main(String[] args){
        try (PrintWriter pw = new PrintWriter("C:/tmp/print-writer-example.txt")){
            pw.println("Hello World from PW");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

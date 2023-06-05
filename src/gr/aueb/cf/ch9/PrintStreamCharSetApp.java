package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Defines PrintStream with Charset.
 *
 * @author Ntirintis John
 */
public class PrintStreamCharSetApp {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/ps-file-example1.txt", StandardCharsets.UTF_8)){
            ps.println("Hello");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

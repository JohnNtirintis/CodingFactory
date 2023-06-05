package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Showcases different output/print ways.
 *
 * @author Ntirintis John
 */
public class PrintStreamMethod {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf-example.txt");

        printMsg(ps, "Hello Coding and");   //Prints to ps (file)
        printMsg(System.out, "Coding Factory"); // Prints to terminal

    }

    /**
     * Prints a string message to PrintStream
     *
     * @param ps        the PrintStream Object
     * @param message   the message to print
     */
    public static void printMsg(PrintStream ps, String message){
        ps.println(message);
    }
}

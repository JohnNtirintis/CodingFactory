package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Reads a char
 *
 * @author Ntirintis John
 */
public class CharInputApp {
    public static void main(String[] args) throws IOException {
        char inputChar;

        System.out.println("Input ASCII");
        inputChar = (char) System.in.read();

        System.out.println(inputChar);


    }
}

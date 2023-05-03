package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 *
 * @author Ntirintis John
 */
public class StringInputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;

        System.out.println("Provide string");
        // text = in.next(); // ends with whitespace (space, \t, \n)
        text = in.nextLine();
    }
}

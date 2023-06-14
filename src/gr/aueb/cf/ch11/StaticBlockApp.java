package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * @author Ntirintis John
 */
public class StaticBlockApp {
    static Scanner in = new Scanner(System.in);
    static int count;

    // In static blocks/initializers it's possible to have
    // more complex statements
    // While in static vars we only have simple expression
    static {
        int num = in.nextInt();
        count = (num == 1) ? 1 : 0;
    }

    public StaticBlockApp(){

    }
}

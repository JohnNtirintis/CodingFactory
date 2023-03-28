package gr.aueb.cf.ch2;

/**
 * Rolls 2 die
 *
 */

public class Random2DieApp {
    public static void main(String[] args) {

        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die1: %d, Die2: %d", die1, die2);

    }
}

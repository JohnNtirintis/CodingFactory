package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Checks if a num is odd/even
 *
 * @author Ntirintis John
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isEven = false;

        System.out.println("Give num: ");
        num = sc.nextInt();

        isEven = isEven(num);
        System.out.printf("Is %d even? %b", num ,isEven);

    }

    /**
     * Evaluates if an int is
     * even or not
     *
     * @param n the number (int) to evaluate
     * @return true if even, false if odd
     */
    public static boolean isEven(int n){
        return n % 2 == 0;
    }
}

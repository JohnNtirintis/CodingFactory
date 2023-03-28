package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Asks the user to input 3 ints
 * and it calculates the sum
 *
 */


public class MaxOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Give 3 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.printf("The max between %d %d %d is %d", num1, num2, num3, Math.max(num1, Math.max(num2, num3)));



    }
}

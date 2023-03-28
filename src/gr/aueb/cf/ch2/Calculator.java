package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * The user inputs 2 integers and,
 * it calculates the +,-,*,/ and %
 *
 */


public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input 2 numbers: ");
        int num1 = 0;
        int num2 = 0;

        System.out.println("Sum of addition is: " + (num1 + num2));
        System.out.println("Sum of subtraction is: " + (num1 - num2));
        System.out.println("Sum of multiplication is: " + (num1 * num2));
        System.out.println("Sum of division is: " + (num1 / num2));
        System.out.println("Sum of mod is: " + (num1 % num2));




    }
}

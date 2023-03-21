package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Demonstrates the use of the Scanner Class
 * i.e. it reads from std input (the keyboard)
 */

public class ScannerApp {
    public static void main(String[] args) {

        //Format: Scanner var = new Scanner(System.var)
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert 2 integers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.printf("The integers that you entered are: %d ,and %d \n", num1 , num2);
        sum = num1 + num2;
        System.out.printf("The sum of %d and %d is: %d \n", num1, num2, sum);
    }
}

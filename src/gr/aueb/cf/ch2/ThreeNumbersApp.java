package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Asks the user to input 3 integers
 * it subtracts them by 1,
 * and it prints them with the same order they were inputted
 * leaving just 1 space inbetween them
 */


public class ThreeNumbersApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please input 3 integers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        num1--;
        num2--;
        num3--;

        System.out.printf("The numbers are: %d %d %d", num1, num2, num3);

    }
}

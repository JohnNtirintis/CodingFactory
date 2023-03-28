package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Asks the user to input an int number
 * and calculates the sum of the digits
 *
 */

public class IntToDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int digits = 0;
        int sumDigits = 0;
        int leftDigit = 0;
        int rightDigit = 0;

        System.out.println("Enter a 2 digit number: ");
        digits = sc.nextInt();

        leftDigit = digits / 10;
        rightDigit = digits % 10;

        System.out.printf("The 1st digit is %d and the 2nd digit is %d \n",leftDigit, rightDigit );

        sumDigits = leftDigit + rightDigit;
        System.out.printf("The total of the 2 digits is:", sumDigits);



    }
}

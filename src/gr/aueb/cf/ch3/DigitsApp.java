package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the number of the digits
 * and its total
 *
 */

public class DigitsApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int leftmost = 0;
        int rightmost = 0;

        num = inputNum;

        do {
            count++;
            currentDigit = num % 10;
            sum += currentDigit;
            if(count == 1){
                rightmost = currentDigit;
            }
            num = num / 10;

        }while(num != 0);

        leftmost = currentDigit;

        sumLeftRight = rightmost + leftmost;

        System.out.printf("Sum of digits: %d", count );
        System.out.printf("Sum of most left and right digits: %d", sumLeftRight);

    }
}

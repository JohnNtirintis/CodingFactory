package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the Square/Cube root
 * of an integer that the user will input
 *
 */
public class MathPowersApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNum = 0;

        System.out.println("Input a num:");
        inputNum = sc.nextInt();

        System.out.printf("The Square root of the number %d that you provide is: %d", inputNum, (int) Math.pow(inputNum, 2));
        System.out.printf("The Cube roof of the number %d that you provided is: %d",inputNum, (int) Math.pow(inputNum, 2));
    }
}

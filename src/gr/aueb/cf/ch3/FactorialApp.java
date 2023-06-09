package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the Factorial of a number
 *
 *
 */

public class FactorialApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long facto = 1L;
        int i = 1;
        int n = 0;

        System.out.println("Insert N");
        n = sc.nextInt();

        while(i <= n){
            facto *= i;
            i++;
        }

        System.out.printf("The factorial of the number %d is: %d", n, facto);
    }
}

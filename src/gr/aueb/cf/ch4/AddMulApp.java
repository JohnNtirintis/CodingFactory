package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Adds and multiplies
 * n integers
 * @author Ntirintis John
 */
public class AddMulApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Give n:");
        n = in.nextInt();

        for(int i = 1; i <= n; i++){
            sum += i;
            result *= i;
        }

        System.out.printf("Sum is %d", sum);
        System.out.printf("Result is: %d", result);
        System.out.printf("Mul: %,d", result);
    }
}

package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts Fahrenheit to celsius
 *
 *
 */


public class CelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int celsius = 0;
        int fahr = 0;

        System.out.println("Give temp to convert");
        fahr = in.nextInt();

        celsius = 5 * (fahr - 32) / 9;

        System.out.printf("%d\u00B0 = %d\u00B0C", fahr, celsius);

    }
}

package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts USD to euros
 * Inputs from the user's keyboard an intenger (int)
 * which is the total amount of Euros and converts it to USD
 * Finally it returns the result
 */

public class EuroToUSDConverterApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input_euros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //Gets user input
        System.out.println("Please input the total amount of euros that you wan to convert to USD:");
        input_euros = sc.nextInt();

        //Converts Euros to USD Cents
        //Then calculates the cents
        totalUsaCents = input_euros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d dollars, %d cents", input_euros, usaDollars, usaCents);





    }
}

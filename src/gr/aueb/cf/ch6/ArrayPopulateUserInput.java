package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Demonstrates how to populate an array with user input
 *
 * @author Ntirintis John
 */
public class ArrayPopulateUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];

        for(int i = 0; i < ages.length; i++){
            System.out.println("Enter age:");
            ages[i] = sc.nextInt();
        }

        System.out.println("The array is now filled and it will be printed: ");

        for(int element : ages){
            System.out.println(element);
        }
    }
}

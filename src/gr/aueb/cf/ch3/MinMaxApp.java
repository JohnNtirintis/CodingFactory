package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Finds the min max values
 * from 2 numbers that were given
 * by the user
 */

public class MinMaxApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;

        System.out.println("Give 2 ints");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //One way to do it is:
        // max = num1 > num2 ? num1 : num2;
        // min = num1 > num2 ? num2 : num1;

        //Can also use Math.max && Math.min

        if(num1 != num2){
            if(num1 > num2){
                max = num1;
                min = num2;
            }
            else{
                max = num2;
                min = num1;
            }
        }

    }
}

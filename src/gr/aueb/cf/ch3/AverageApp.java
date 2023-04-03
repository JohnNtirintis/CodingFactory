package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the average of
 * the grades of a student
 */

public class AverageApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("Provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if(total == 0){
            System.out.println("Invalid Total");
            System.exit(1);
        }

        if(count == 0){
            System.out.println("Invalid Coount");
            System.exit(1);
        }

        average = total / count;

        //Max grade is 10
        if(average> 10){
            System.out.println("Invalid Average");
            System.exit(1);
        }

        if(average >= 9){
            System.out.println("Excellent");
        }
        else if(average >= 7){
            System.out.println("Very good");
        }
        else{
            System.out.println("Less than 7");
        }
    }
}

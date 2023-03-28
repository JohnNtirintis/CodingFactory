package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Counts all the positive numbers
 * untill the user inserts a negative number
 *
 */
public class PositivesCountApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num;
        int positiveCount = 0;

        System.out.println("Give a num: ");
        num = in.nextInt();

        while(num >= 0){
            positiveCount++;
            System.out.println("Give int");
            num = in.nextInt();
        }

        System.out.printf("Total count of positives: %d", positiveCount );
    }
}

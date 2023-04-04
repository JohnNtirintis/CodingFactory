package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Reads from stdin (keyboard)
 * start, end and step values
 * Finally, it prints the results
 *
 * @author Ntirintis John
 */
public class ForFlexApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startValue;
        int endValue;
        int stepValue;
        int iterations = 0;

        System.out.println("Give start, end and step");
        startValue = sc.nextInt();
        endValue = sc.nextInt();
        stepValue = sc.nextInt();

        for(int i = startValue; i <= endValue; i += stepValue){
            iterations++;
            System.out.printf("i is: %d", i);
        }

        System.out.println("Iterations: " + iterations);
    }
}

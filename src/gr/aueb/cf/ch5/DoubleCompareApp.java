package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Checks equality - inequality
 * for float nums
 *
 * @author Ntirintis John
 */
public class DoubleCompareApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double d1;
        double d2;
        final double EPSILON = 0.005;

        System.out.println("Enter 2 doubles: ");
        d1 = in.nextDouble();
        d2 = in.nextDouble();

        if(Math.abs(d2 - d1) <= EPSILON){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }


    }
}

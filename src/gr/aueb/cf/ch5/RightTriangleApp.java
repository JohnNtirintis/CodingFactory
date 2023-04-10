package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * User inputs 3 nums (a,b,c)
 * a is hypotenuse
 * b,c are the other sides
 *
 * this program checks if,
 * the triangle is a right triangle
 * @author Ntirintis John
 */
public class RightTriangleApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a,b,c;
        boolean check;
        final double EPSILON = 0.00005;

        System.out.println("Enter your nums, the first num is your hypotenuse");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        check = Math.abs(a*a - b*b - c*c) <= EPSILON;

        System.out.printf("Is the triangle right? %b", check);
    }
}

package gr.aueb.cf.ch4;

import java.util.Scanner;
import java.math.*;


/**
 *  a frog wants to cross a river
 *  frog is in location x and wants to reach location y
 *  frog jumps a fixed distance (d)
 *
 *  Calculate the minimum number of jumps for the frog
 *  to cross the river
 *
 *  i.e.
 *  x = 10
 *  y = 85
 *  d = 30
 *
 *  then the frog will need 3 jumps to reach y
 *
 *  Starts at 10, then jumps to 40 then to 70
 *
 * @author Ntirintis John
 */
public class FrogApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x, y, d;
        int jumps = 0;

        System.out.println("Enter x,y,d");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();

        while(x < y){
            x += d;
            jumps++;
        }

        //alternative:

        jumps = (int) Math.ceil((y-x) / (double) d);
        System.out.printf("Total number of jumps needed is: %d", jumps);



    }
}

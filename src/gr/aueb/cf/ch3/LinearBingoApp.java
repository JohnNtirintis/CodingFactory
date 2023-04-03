package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearizes if-then-else
 *
 */
public class LinearBingoApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        final int SECRET = 24;
        boolean bingo = false;

        while(!bingo){
            System.out.println("Give a num:");
            num = in.nextInt();

            if(num != SECRET){
                System.out.println("Try again!");
                continue;
            }

            System.out.println("Bingo");
            //break;
            bingo = true;

        }



    }
}

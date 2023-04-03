package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Bingo when the users guesses,
 * the secret key
 *
 */

public class BingoApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        final int SECRET = 24;

        while(true){
            System.out.println("Insert secret:");
            num = in.nextInt();

            if (num == SECRET){
                System.out.println("Bingo");
                break;
            }
        }


    }
}

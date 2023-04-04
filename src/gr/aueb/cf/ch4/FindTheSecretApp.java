package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * The user has 10 tries to find/guess
 * a secret number
 * if he finds it earlier than 10 tries
 * the for loop will stop
 *
 * @author Ntirintis John
 */
public class FindTheSecretApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int guess;
        int tries = 10;
        final int SECRET = 24;
        boolean found = false;

        for(int i = 1; i <= 10; i++){
            System.out.println("Make your guess:");
            guess = in.nextInt();

            if(guess == SECRET) {
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Dont worry you can try again");
            System.exit(1);
        }

        System.out.println("Success!");
    }
}

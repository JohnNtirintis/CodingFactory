package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class InputMismatchExceptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while(true){
            try {
                System.out.println("Input your guess");

                inputNum = in.nextInt();

                if(inputNum ==  MAGIC_NUM){
                    System.out.println("You guessed the correct number");
                    break;
                }
            } catch (InputMismatchException e){
                in.nextLine();
                System.out.println("Error, Please insert an int");
            }
        }

        System.out.println("Thanks for playing.");
    }
}

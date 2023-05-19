package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcept2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while(true){

                System.out.println("Input your guess");

                inputNum = in.nextInt();

                if(inputNum ==  MAGIC_NUM){
                    System.out.println("You guessed the correct number");
                } else {
                    in.nextLine();
                    System.out.println("Error, Please insert an int");
                    continue;
                }

                if(inputNum == MAGIC_NUM){
                    System.out.println("You guessed the correct number");
                    break;
                }

        }

        System.out.println("Thanks for playing.");
    }
}

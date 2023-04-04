package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch case, gets users choice
 * based on a menu
 *
 * @author Ntirintis John
 */
public class SwitchCaseApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Start a single player game");
            System.out.println("2. Start a multiplayer game");
            System.out.println("3. Team Game");
            System.out.println("4. Quit");
            System.out.println("Please input your choice");

            choice = in.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Starting a single player game");
                    break;
                case 2:
                    System.out.println("Starting a multiplayer gamne");
                    break;
                case 3:
                    System.out.println("Starting a team game");
                    break;
                case 4:
                    System.out.println("Quitting");
                    break;
                default:
                    System.out.println("Error! Check your input!");
                    break;
            }

        }while(choice != 4);

        System.out.println("Goodbye!");

    }
}

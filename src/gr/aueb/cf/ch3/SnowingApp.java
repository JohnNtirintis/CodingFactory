package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Concludes if its snowing or not
 * depending on the temperature and,
 * if its raining
 * i.e. temp < 0 && isRaining then isSnowing is true
 */

public class SnowingApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int temp = 0;
        boolean isSnowing = false;
        boolean isRaining = false;

        //User input
        System.out.println("Please enter the temperature degrees");
        temp = in.nextInt();

        System.out.println("Is it raining or not? Reply with true/false");
        isRaining = in.nextBoolean();

        //Calculating if its raining
        isSnowing = isRaining && (temp < 0);

        System.out.printf("Is it snowing? %b", isSnowing);

    }
}

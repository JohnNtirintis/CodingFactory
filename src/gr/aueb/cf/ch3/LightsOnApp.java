package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Concludes if the lights of an automobile vehicle
 * should be turned on, based on 3 variables:
 * if its raining and if at least one of the following is true:
 * isDark, isRunning (kph > 100)
 * Expects user input
 *
 */

public class LightsOnApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int SPEED_TRIGGER = 100;

        System.out.println("Please enter if its raining or not in the form of true/false");
        isRaining = sc.nextBoolean();

        System.out.println("Please enter if its dark or not in the form of true/false");
        isDark = sc.nextBoolean();

        System.out.println("Please enter the speed of the car (kph)");
        speed = sc.nextInt();

        isRunning = speed > SPEED_TRIGGER;

        lightsOn = isRaining && (isDark || isRunning);

        System.out.printf("Should the lights be on? %b", lightsOn);



    }
}

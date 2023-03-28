package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts seconds to days, hours, minutes and seconds
 *
 *
 */
public class SecondsToHoursApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int DAY_SECONDS = 24 * 3600;
        final int HOUR_SECONDS = 3600;
        final int MINUTE_SECONDS = 60;

        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int remainingSeconds = 0;


        System.out.println("Please enter the amount of seconds:");
        inputSeconds = scanner.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY_SECONDS;
        remainingSeconds %= DAY_SECONDS;

        hours = remainingSeconds / HOUR_SECONDS;
        remainingSeconds %= HOUR_SECONDS;

        minutes = remainingSeconds / MINUTE_SECONDS;
        remainingSeconds %= MINUTE_SECONDS;

        System.out.printf("The total days, hours, minutes and seconds of %d seconds is: %d days, %d hours %d minutes and %d seconds",
                inputSeconds ,days, hours, minutes, remainingSeconds);

    }
}

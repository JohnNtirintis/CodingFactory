package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * It converts hours, minutes and seconds to secods
 *
 *
 */
public class SecondsApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int MINUTES_PER_HOUR = 60;

        // Asks the user to input value
        System.out.println("Please enter: hours, minutes and seconds");
        inputHours = sc.nextInt();
        inputMinutes = sc.nextInt();
        inputSeconds = sc.nextInt();

        totalSeconds = inputHours * SECONDS_PER_HOUR + inputMinutes * MINUTES_PER_HOUR + inputSeconds;

        System.out.printf(Locale.US, "The total amount of seconds from %d hours, %d minutes and %d seconds is: %,d",
                inputHours, inputMinutes, inputSeconds, totalSeconds);
    }


}

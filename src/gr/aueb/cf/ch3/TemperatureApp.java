package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Concludes if it is snowing or not
 * Depending on the temperature
 * i.e. if temp < 0 then its snowing
 * else if temp > 0 then its NOT snowing
 */

public class TemperatureApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please enter the temperature");
        temp = sc.nextInt();

        isSnowing = temp < 0;

        System.out.printf("Is it snowing? %b", isSnowing);



    }
}

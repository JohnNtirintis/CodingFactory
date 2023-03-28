package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * One aircraft has 2 tanks
 * if one tank has less than a quarter (1/4) of fuel
 * then an orange warning lights turns on
 * if both tanks have less than a quarter of fuel each,
 * then a red warning light turns on
 */


public class OrangeRedSignalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX_TANK_FUEL = 1000;
        int leftTankFuel = 0;
        int rightTankFuel = 0;
        boolean isLeftTankLessThanQuarter = false;
        boolean isRightTankLessThanQuarter = false;
        boolean orangeLight = false;
        boolean redLight = false;

        System.out.println("Please enter the amount of fuel for the left tank");
        leftTankFuel = sc.nextInt();

        System.out.println("Please enter the amount of fuel for the left tank");
        rightTankFuel = sc.nextInt();

        //Will complete the rest after the class.

    }
}

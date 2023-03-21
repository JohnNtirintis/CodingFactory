package gr.aueb.cf.ch2;

/**
 * Expressions Example
 */

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        //If highlighted colour == yellow
        //then expression will always equal 0 (zero)
        result1 = num1 + num2 * num2 - 5 / num1 % 4;

        //first it assigns the value and then it increments it
        result2 = num1++; //result2 -> 12 , num1 -> 13

        //first it increments the value, and then it assigns it
        //so both variables are assigned the same incremented value
        result2 = ++num2; // num2 -> 6, result2 -> 6

        result2 = num1;
        num1++;

        result1 = result1 + 10;
        result1 += 10;

        result1 = result1 * 10;
        result1 *= 10;

        System.out.printf("Sum: %d, Sub: %d, Mul: %d, Div: %d, Mod: %d \n", sum, sub, mul, div, mod);
        System.out.printf("The sum of %d ,and %d is: %d \n", num1, num2, sum);
        System.out.printf("The sub of %d ,and %d is: %d \n", num1, num2, sub);
        System.out.printf("The mul of %d ,and %d is: %d \n", num1, num2, mul);
        System.out.printf("The div of %d ,and %d is: %d \n", num1, num2, div);
        System.out.printf("The mod of %d ,and %d is: %d \n", num1, num2, mod);
        System.out.printf("The result of the calculation result1 %d is \n", result1);

    }
}

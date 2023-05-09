package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 5;
        int num2;
        int result;

        System.out.println("Insert num2");
        num2 = in.nextInt();
//        try {
//            num2 = in.nextInt();
//        } catch (ArithmeticException e){
//            System.out.println("Please dont enter 0 as a denominator");
//        }

        if(num2 == 0){
            System.out.println("Please dont enter 0 as a denominator");
            System.exit(1);
        }

        result = num1 / num2;

        System.out.println(result);
    }
}

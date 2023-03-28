package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * a ^ b
 *
 *
 */


public class PowerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        System.out.println("Enter a,b");
        a = sc.nextInt();
        b = sc.nextInt();

        while(i <= b){
            result *= a;
            i++;
        }

        System.out.printf("%d^%d = %d", a, b, result);

    }
}

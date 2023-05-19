package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Typecast from String to Int
 *
 */
public class TypecastApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;
        int num;

        System.out.println("Please insert a num");
        word = sc.next();
        num = Integer.parseInt(word);

        System.out.println("Num is: " + num);
    }
}

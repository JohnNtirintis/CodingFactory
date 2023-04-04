package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Gets a grade (num) from the users
 * provides feedback based on their grade
 *
 * @author Ntirintis John
 */
public class SwitchFallThrough {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade;

        System.out.println("Give grade:");
        grade = sc.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Incorrect Grade");
                break;
        }
    }
}

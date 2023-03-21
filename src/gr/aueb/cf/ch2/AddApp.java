package gr.aueb.cf.ch2;

/**
 * Overflow
 * (yes that overflow)
 */
public class AddApp {
    public static void main(String[] args) {
     //Variable initialization
     long num = 2_147_483_647;
     long num2 = 1;

     //Expressions
     long result = num + num2;

     //Print
     System.out.println("Sum: " + result);
    }
}

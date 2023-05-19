package gr.aueb.cf.ch7;

/**
 * Compares two strings
 *
 */
public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");

        //In case we did s1 == s2
        //Then we will be comparing the memory pointers

        // equals() compares based on the values
        if(s1.equals(s3)){
            System.out.println("Equal");
        }

        //Compare strings and be case insensitive
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("Equal");
        }

    }
}

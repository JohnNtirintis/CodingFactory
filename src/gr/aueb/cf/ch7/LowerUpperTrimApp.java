package gr.aueb.cf.ch7;

import java.util.Locale;

/**
 * Transforms Strings
 *
 */
public class LowerUpperTrimApp {
    public static void main(String[] args) {
        String s1 = "Athens Uni";
        String lowerCase;
        String upperCase;
        String trimmed;
        String s2 = "";

        lowerCase = s1.toLowerCase();
        upperCase = s1.toUpperCase();
        trimmed = s1.trim();

        // Repeats char N times
        System.out.println("*".repeat(10));

        if(s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }
}

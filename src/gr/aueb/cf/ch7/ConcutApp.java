package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings
 *
 */
public class ConcutApp {
    public static void main(String[] args) {
        String title = "Dr. ";
        String firstName = "John ";
        String lastName = "Ntirintis";
        String fullName;
        String titledFullName;

        // Simplest way
        fullName = firstName + lastName;

        // Using the concat func
        titledFullName = title.concat(firstName).concat(lastName);

        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}

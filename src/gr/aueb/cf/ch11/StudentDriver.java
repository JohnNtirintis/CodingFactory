package gr.aueb.cf.ch11;

/**
 * Creates a Student Instance Called Alice
 *
 * @author Ntirintis John
 */
public class StudentDriver {
    public static void main(String[] args) {
        // Calls Student() which is a constructor
        // The point of constructor is to init the fields (i.e. firstName) of the class
        // The default constructor doesn't take any args or params and inits the fields
        // With default values, Strings = null, Int = 0 etc.
        // JVM is what inits them
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "Marley");
        Student john = new Student();


        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        System.out.println("ID: " + alice.getId());
        System.out.println("First Name: " + alice.getFirstName());
        System.out.println("Last Name: " + alice.getLastName());

        System.out.println("ID: " + bob.getId());
        System.out.println("First Name: " + bob.getFirstName());
        System.out.println("Last Name: " + bob.getLastName());

        System.out.println(Student.getStudentsCount());
    }
}

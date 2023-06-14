package gr.aueb.cf.ch11;

/**
 * Simple Student Class Init
 * Will be used as an object class
 * For other classes to create Objects or Instances
 *
 * @author Ntirintis John
 */
public class Student {
    // If we don't define the visibility / scoping of a variable
    // The default value that it's given is "package private"
    // Which is accessible only from the same class and
    // From other classes inside the same package
    private static int studentsCount;
    private int id;
    private String firstName;
    private String lastName;

    // Static block example
    static {
        studentsCount = 0;
    }

    // Default Constructor
    // No need for a body since JVM handles it
    public Student(){
        studentsCount++;
    }

    public static int getStudentsCount(){
        return studentsCount;
    }

    // Overloaded Constructor
    public Student(int id, String firstName, String lastname){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

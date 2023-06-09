package gr.aueb.cf.ch16.functionalinterfaces;

/**
 * @author Ntirintis John
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student() {}

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void printStudent(){
        System.out.println(this);
    }

    public static void printStaticStudent(Student student){
        System.out.println(student);
    }
}

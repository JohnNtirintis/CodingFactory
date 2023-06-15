package gr.aueb.cf.ch14;

/**
 * Defines a {@link Teacher} class.
 *
 * @author Ntirintis John
 */
public class Teacher {
    private Long id;
    private String firstName;
    private String lastName;

    public Teacher() {}
    public Teacher(Long id) {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void saySomething(String message){
        System.out.println(message);
    }
}

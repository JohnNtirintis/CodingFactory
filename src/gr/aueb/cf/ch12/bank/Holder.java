package gr.aueb.cf.ch12.bank;

/**
 * @author Ntirintis John
 */
public class Holder {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String ssn;

    public Holder(){
        id = 0L;
        firstName = "";
        lastName = "";
        ssn = "";
    }

    public Holder(Long id, String firstName, String lastName, String ssn){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public Long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}

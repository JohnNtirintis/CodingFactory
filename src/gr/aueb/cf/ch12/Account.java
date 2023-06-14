package gr.aueb.cf.ch12;

/**
 * @author Ntirintis John
 */
public class Account {
    private int id;
    private String iban;
    private String firstName;
    private String lastName;
    private String ssn;
    private double balance;

    // Service Layer, Public API

    /**
     * Deposits a zero or positive amount of money
     * to accounts balance
     *
     * @param amount the amount to be deposited
     * @throws Exception if the amount is negative
     */
    public void deposit(double amount) throws Exception{
        try {
            if (amount >= 0){
                balance += amount;
            } else {
                throw new Exception("Negative amount exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws money from the accounts balance
     *
     *
     * @param amount the amount to be withdrawn
     * @throws Exception if the amount is greater than the account's balance
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if(!isSsnValid(ssn)) throw new Exception("Ssn is not valid exception");
            if(amount <= balance){
                balance -= amount;
            } else {
                throw new Exception("Amount greater than balance");
            }
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the account's balance.
     *
     * @return the accounts balance
     */
    public double getAccountBalance(){
        return getBalance();
    }

    /**
     * Returns the account state in String format
     *
     * @return all the account details
     */
    public String getAccountState(){
        return "(" +
                  id + "," +
                  iban + "," +
                 firstName + "," +
                 lastName + "," +
                 ssn + "," +
                balance +
                ')';
    }

    /**
     * Checks to see if the ssn that the user provided is valid
     *
     * @param ssn ssn that user enters
     * @return returns true/false depending on if it matches
     */
    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }


    // Constructors, Getters & Setters

    public Account() {}

    public Account(int id, String iban, String firstName, String lastName, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

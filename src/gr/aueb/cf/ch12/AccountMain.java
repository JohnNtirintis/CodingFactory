package gr.aueb.cf.ch12;

/**
 * @author Ntirintis John
 */
public class AccountMain {
    public static void main(String[] args) {
        Account daniel = new Account(1, "GR12345", "Daniel", "R.", "R333", 100);

        try {
            daniel.deposit(900);

            daniel.withdraw(500, "R333");

            System.out.println("Get Daniel's account balance: " + daniel.getAccountBalance());
            System.out.println(daniel.getAccountState());

            daniel.withdraw(100, "T456");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

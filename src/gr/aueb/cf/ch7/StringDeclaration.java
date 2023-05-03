package gr.aueb.cf.ch7;

/**
 * @author Ntirintis John
 */
public class StringDeclaration {
    public static void main(String[] args) {
        String alice = "Alice";
        String alice2 = "Alice";
        String bob = new String("Bob");

        System.out.println(alice);
        System.out.println(alice2 + " " + bob);
        System.out.printf("%s", bob);

    }
}

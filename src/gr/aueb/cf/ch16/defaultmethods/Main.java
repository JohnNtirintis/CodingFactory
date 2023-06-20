package gr.aueb.cf.ch16.defaultmethods;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        IWelcome welcome = new CodingFactory();
        welcome.sayHelloCodingFactory();
    }
}

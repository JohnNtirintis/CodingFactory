package gr.aueb.cf.ch16.defaultmethods;

/**
 * @author Ntirintis John
 */
public interface IWelcome {
    void saySomething(String message);

    default void sayHelloCodingFactory() {
        System.out.print("Hello ");
        sayCodingFactory();
    }

    private void sayCodingFactory(){
        System.out.println("CF!");
    }

    static void sayHelloCoding(){
        System.out.print("Hello ");
        sayCoding();
    }

    private static void sayCoding(){
        System.out.println("Coding!");
    }
}

package gr.aueb.cf.ch16.defaultmethods;

/**
 * @author Ntirintis John
 */
public class CodingFactory implements IWelcome{
    // It's necessary to override
    // Because its public and abstract
    @Override
    public void saySomething(String message) {
        System.out.println("Please get the message " + message);
    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5));
    }
}

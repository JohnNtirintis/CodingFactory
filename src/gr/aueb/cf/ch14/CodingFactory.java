package gr.aueb.cf.ch14;

/**
 * Defines a Singleton Coding Factory
 * that says Hello
 *
 * @author Ntirintis John
 */
public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory() {}

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }
}

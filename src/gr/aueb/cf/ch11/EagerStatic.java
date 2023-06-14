package gr.aueb.cf.ch11;

/**
 * Will instantiate NAME when the class will be loaded/run
 * This is called Eager Instantiation
 *
 * @author Ntirintis John
 */
public class EagerStatic {
    private final static String NAME = "AUEB";

    public EagerStatic(){

    }

    public static String getName() {
        return NAME;
    }
}

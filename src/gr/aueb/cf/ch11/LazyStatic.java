package gr.aueb.cf.ch11;

/**
 * Will init/instantiate the var s when the constructor is called
 * This is lazy instantiation
 *
 * @author Ntirintis John
 */
public class LazyStatic {
    private static String s;

    public LazyStatic(){
        s = "AUEB";
    }

    public static String getName(){
        return s;
    }
}

package gr.aueb.cf.ch14;

/**
 * POJO Utility Class
 *
 * @author Ntirintis John
 */
public class HelloUtil {
    /**
     * No instances of this utility class should be available.
     *
     * NOTICE: that the constructor is private
     * This prevents other class from creating instances of HelloUtil
     */
    private HelloUtil(){}

    public static void sayHello(){
        System.out.println("Hello, World!");
    }

}

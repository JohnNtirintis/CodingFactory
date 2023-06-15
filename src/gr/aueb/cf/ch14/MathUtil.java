package gr.aueb.cf.ch14;

/**
 * Demonstrates a Utility Class
 *
 * @author Ntirintis John
 */
public class MathUtil {

    // Private constructor
    private MathUtil() {}

    //To use this function, you have to call it directly on the MathUtil class
    public static int factorial(int num){
        int result = 1;
        for(int i = 2; i <= num; i++){
            result *= i;
        }
        return result;
    }
}

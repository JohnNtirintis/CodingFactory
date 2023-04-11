package gr.aueb.cf.ch5;

/**
 * Calculates x to the power of n
 * Using recursion
 *
 * @author Ntirintis John
 */
public class RecursivePowerApp {
    public static void main(String[] args) {


        System.out.println(power(5,-4));
    }

    /**
     *
     *
     * @param a the base
     * @param n the power
     * @return recursion a^n
     */
    public static double power(int a, int n){

        if(n == 0) return 1;
        if (n < 0) return 1.0 / a * power(a,-n);
        return a * power(a,n-1);


    }
}

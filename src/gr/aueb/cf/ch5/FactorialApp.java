package gr.aueb.cf.ch5;

/**
 * Calculates the factorial of a number
 * using a method
 *
 * @author Ntirintis John
 */
public class FactorialApp {
    public static void main(String[] args) {

        int sum = facto(5);

        System.out.println(sum);
    }

    public static int facto(int x){
        if (x <= 1) return x;

        return x * facto(x-1);

//        Alternative way:
//        return (n <= 1) ? 1 : n * facto(n-1)

    }
}

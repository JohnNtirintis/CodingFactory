package gr.aueb.cf.ch5;

/**
 * Adds 2 ints using
 * another class
 *
 * @author Ntirintis John
 */
public class AddApp {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum;

        sum = add_ints(a,b);

        System.out.printf("The sum is: %d", sum);

    }

    public static int add_ints(int a, int b){
//        int sum = a + b;
//        return sum;
        return a + b;
    }

}

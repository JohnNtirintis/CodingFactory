package gr.aueb.cf.ch5;

/**
 * Calculates the power of a number
 * using classes
 *
 * @author Ntirintis John
 */
public class PowerApp {
    public static void main(String[] args) {

        int sum = pow(5,2);

        System.out.println(sum);
    }

    public static int pow(int a, int b){
        int sum = 0;
        for(int i = 1; i <= b; i++){
            sum *= a;
        }
        return sum;
    }
}

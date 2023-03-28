package gr.aueb.cf.ch3;

/**
 * Calculates the sum
 * of the first 10 ints
 *
 */
public class SumAndMul10App {
    public static void main(String[] args) {

        int mul = 1;
        int sum = 0;
        int i = 1;

        while(i <= 10){
            sum += i;
            mul *= i;
            i++;
        }
        System.out.printf("The sum is: %d", sum);
        System.out.printf("The sum of the multiplications is: %d ", mul);

    }
}

package gr.aueb.cf.ch5;

/**
 * Showcases swapping with call by value
 * Which doesnt work in this case
 *
 * @author Ntirintis John
 */
public class SwapApp {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        swap(a,b);

        System.out.printf("a = %d \n", a);
        System.out.printf("b = %d ", b);

    }

    /**
     * Swaps num1 and num2
     *
     * @param num1
     * @param num2
     * @return
     */
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

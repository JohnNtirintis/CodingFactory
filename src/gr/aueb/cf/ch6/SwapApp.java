package gr.aueb.cf.ch6;

/**
 * Swap values
 * using call by reference
 *
 * @author Ntirintis John
 */
public class SwapApp {
    public static void main(String[] args) {
        int[] arr = {11, 24};

        swap(arr);

        for(int item : arr){
            System.out.println(item);
        }
    }

    public static void swap(int[] arr){
        if (arr == null || arr.length != 2) return;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}

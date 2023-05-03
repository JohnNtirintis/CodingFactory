package gr.aueb.cf.ch6;

/**
 * Showcases the bubble sort algorithm
 *
 * @author Ntirintis John
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 11, 55, 5, 77, 44, 3, 4};

        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
    // Swaps values
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

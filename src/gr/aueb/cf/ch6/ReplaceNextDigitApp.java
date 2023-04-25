package gr.aueb.cf.ch6;

/**
 * Replaces all array digits
 * with the next element
 *
 */
public class ReplaceNextDigitApp {
    public static void main(String[] args) {

        int[] arr = {5,12,14,77};
        shiftLeftByOne(arr,1); // Should return 12, 14, 77, 0
        for(int item : arr){
            System.out.println(arr[item]);
        }
    }

    public static void shiftLeftByOne(int[] arr, int low){
        if (arr == null || low < 0 || low > arr.length) return;

        for(int i = low; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }
}

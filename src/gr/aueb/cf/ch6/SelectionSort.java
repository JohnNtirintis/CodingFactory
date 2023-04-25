package gr.aueb.cf.ch6;

/**
 *
 *
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,9,1,44,24,11,7};

        int minVal;
        int minPosition;
        int tmp;

        for(int i = 0; i < arr.length - 1; i++){
            // Find the min value
            minPosition = i;
            minVal = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < minVal){
                    minPosition = j;
                    minVal = arr[j];
                }
            }
            // Swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}

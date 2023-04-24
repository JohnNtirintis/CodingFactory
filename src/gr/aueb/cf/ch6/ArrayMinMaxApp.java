package gr.aueb.cf.ch6;

/**
 * Searches for the min and max values
 * of a given array
 *
 * @author Ntirintis John
 */
public class ArrayMinMaxApp {
    public static void main(String[] args) {

        int[] arr = {44, 11, 3, 24, 33, 77, 4};

        int minPosition = 0;
        int maxPosition = 0;
        int minValue = arr[minPosition];
        int maxValue = arr[maxPosition];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            } else if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("The min value is %d at index %d \n", minValue, minPosition);
        System.out.printf("The max value is %d at index %d", maxValue, maxPosition);
    }
}

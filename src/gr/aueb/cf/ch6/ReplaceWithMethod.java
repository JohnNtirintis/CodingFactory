package gr.aueb.cf.ch6;

/**
 * Increments the elements of an array by 1
 *
 * @author Ntirintis John
 */
public class ReplaceWithMethod {
    public static void main(String[] args) {

    }

    public static void upscaleByOne(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr){
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}

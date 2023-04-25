package gr.aueb.cf.ch6;

/**
 * Initializes an array and
 * it populates it
 *
 * @author Ntirintis John
 */
public class PopulateArray {
    public static void main(String[] args) {

         // Initializes an array of length 3
         int[] arr = new int[3];
         arr[0] = 5;
         arr[1] = 7;
         arr[2] = 24;

        // Prints the first digit of the array arr
        System.out.println(arr[0]);

        // Prints the whole array of arr
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Empty line to make some space
        System.out.println();

        // Init arr of length 5
        int[] arr2 = {1, 5, 8, 9, 12};

        // Array initializer
        int[] arr3 = new int[] {4,6,9,10};

        for (int item : arr3){
            System.out.print(item + " ");
        }

    }
}

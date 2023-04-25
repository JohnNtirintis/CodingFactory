package gr.aueb.cf.ch6;

/**
 * Showcases 2 different ways of copying an array
 * Shallow Copy
 * Deep Copy
 *
 */
public class ShallowCopy {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length]; // inits to 0, 0, 0, 0

        // Shallow Copy
        // Arrays are pointers to the memory
        // So if arr1 = arr2
        // You only insert/input the value of the memory address
        // Thus if you change a value in one, it also changes the value to the other
        arr2 = arr1;
        arr2[0] = 24;

        for(int item : arr1){
            System.out.print(item + " ");
        }

        // Deep Copy
        // Copies the values and NOT the memory address
        // Thus making an 'independent' copy that wont create
        // any problems
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
    }
}

package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Makes an array copy by using
 * utility methods
 *
 */
public class ArrayCopyJava {
    public static void main(String[] args) {

        int[] arr = {3, 4, 11, 24};
        int[] arr2 = new int[arr.length];
        int[] arr3;

        // Using System.arraycopy()
        System.arraycopy(arr,0,arr2,0,arr.length);

        // Array classes
        arr3 = Arrays.copyOf(arr2, arr.length);
        arr3 = Arrays.copyOfRange(arr,0,arr.length);

    }
}

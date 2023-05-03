package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Showcases the binary search algorithm in Java
 * For this algo to work the array must already be sorted
 *
 * @author Ntirintis John
 */
public class BinarySearch {
    public static void main(String[] args) {
        // Given value that it's looking for
        final int VALUE = 24;
        int[] testArr = {24,11,55,77,44,3,4,5};
        int low = 0;
        int high = testArr.length - 1;
        int position;

        // Prepares the array by sorting it
        Arrays.sort(testArr);

        position = (binarySearch(testArr,VALUE,low,high));

        System.out.println(position);
    }

    /**
     * Returns the position of a specified value within an array
     *
     *
     * @param arr   the given array
     * @param value the specified value
     * @param low   minimum
     * @param high  maximum
     * @return  returns the position of the specified value
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        int median;

        // Checking input
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (high < low) return -1;

        median = (low + high) / 2;

        //Checks to see if the median is the same as the specified value
        //That requires a lot of luck
        //In case it is, then the algo is O(1), constant time
        if (value == arr[median]) return median;

        // Recursively searches for the given value
        // If the value is lower than the median value then it will -1
        // Else if its greater it will be on the "right" side, and it will +1
        if (value < arr[median]) {
            return binarySearch(arr, value, low, median - 1);
        } else {
            return binarySearch(arr, value, median + 1, high);
        }
    }
}

package gr.aueb.cf.ch6;

/**
 * Demnostrates how to init an int array in java
 *
 * @author Ntirintis John
 */
public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 5;
        arr[1] = 24;
        arr[2] = 3;

        System.out.println("arr[0] = " + arr[0]);

        System.out.printf("%d", arr[2]);
    }
}

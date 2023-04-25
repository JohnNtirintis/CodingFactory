package gr.aueb.cf.ch6;

public class CircularRotationApp {
    public static void main(String[] args) {

        int[] arr = {3,4,7,11,24,44,77};

        arr = doCircularLeftShiftBy(arr, 1);

        printArr(arr);

    }

    public static int[] doCircularRightShiftBy(int[] arr, int offset){
        if(arr == null) return null;

        int[] rotated = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset){
        if(arr == null) return null;

        int[] rotated = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static void printArr(int[] arr){
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}

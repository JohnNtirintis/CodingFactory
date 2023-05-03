package gr.aueb.cf.ch6;

/**
 * @author Ntirintis John
 */
public class SymmetricArray {
    public static void main(String[] args) {
        int[] symmetric = {1,2,3,2,1};
        int[] asymmetric = {1,2,3,4,5,1};

        System.out.println(isSymmetric(symmetric));
        System.out.println(isSymmetric2(symmetric));

    }

    public static boolean isSymmetric(int[] arr) {
        //boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetric2(int[] arr){
        int n = arr.length - 1;

        for(int i = 0; i < n / 2; i++){
            if(arr[i] != arr[n - 1]){
                return false;
            }
        }
        return true;
    }

}



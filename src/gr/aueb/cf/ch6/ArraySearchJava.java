package gr.aueb.cf.ch6;

/**
 * Traverses an array in linear time
 * searching for a secret key (num)
 *
 * @author Ntirintis John
 */
public class ArraySearchJava {
    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1,5,9,3,12};
        boolean secretIsFound = false;

        for(int item : arr){
            if (item == SECRET){
                secretIsFound = true;
                break;
            }
        }

        if(secretIsFound) System.out.println("Secret was found");
        else System.out.println("Secret was not found");
    }
}

package gr.aueb.cf.ch6;

/**
 * Showcases how to init an unsized int array
 *
 * @author Ntirintis John
 */
public class UnsizedInitApp {
    public static void main(String[] args) {
        int[] arr = {2,3,4,24,77};

        for(int element : arr){
            System.out.println(element);
        }
    }
}

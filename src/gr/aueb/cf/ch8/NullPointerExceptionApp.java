package gr.aueb.cf.ch8;

/**
 * Demonstrates the null pointer exception.
 *
 */
public class NullPointerExceptionApp {
    public static void main(String[] args) {
        String s = null;

       if(s != null){
           if(s.equals("Coding")){
               System.out.println("Bingo");
           } else {
               System.out.println("Not Equals");
           }
       } else {
           System.out.println("Is equals");
       }
    }
}

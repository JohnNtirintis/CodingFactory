package gr.aueb.cf.ch7;

/**
 * Splits a String
 *
 */
public class StringSplitApp {
    public static void main(String[] args) {
        String s = "Athens      Uni of Econ and Business";

        //String[] tokens = s.split(" ");
        String[] tokens = s.split(" +");

        for(String token : tokens){
            System.out.println(token);
        }

        if(s.isBlank()){
            System.out.println(s.length());
        }

        if((s.isEmpty())){
            System.out.println("Blank");
        }
    }
}

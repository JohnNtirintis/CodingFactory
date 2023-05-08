package gr.aueb.cf.ch7;

public class CompareApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";

        // Can we use IgnoreCase here?
        if(s1.compareTo(s2) < 0){
            System.out.println("s1 lower than s2");
        } else if (s1.compareTo(s2) > 0 ){
            System.out.println("s1 greater than s2");
        }
        else {
            System.out.println("Equal");
        }
    }
}

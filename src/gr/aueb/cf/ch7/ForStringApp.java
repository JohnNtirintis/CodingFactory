package gr.aueb.cf.ch7;

/**
 * @author Ntirintis John
 */
public class ForStringApp {
    public static void main(String[] args) {
        String text = "Coding Factory";
        String substring = text.substring(0, 6);

        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i) + " ");
        }

        System.out.println("\u2764");


        for(char ch : text.toCharArray()){
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        // Case sensitive
        int index = text.indexOf("o", 7);
        System.out.println(index);

        // Case sensitive
        int index2 = text.lastIndexOf("o");
        System.out.println(index2);

        // Case sensitive
        if(text.startsWith("Cod")) System.out.println("It does start with Cod");


    }
}

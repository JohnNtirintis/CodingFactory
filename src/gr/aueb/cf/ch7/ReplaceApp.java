package gr.aueb.cf.ch7;

/**
 * Reokaces a string
 *
 */
public class ReplaceApp {
    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashTitle;

        //First par is the char/target that we want to replace
        //Second par is what it will be replaced with
        dashTitle = title.replace(" ", "-");
        System.out.println(dashTitle);

    }
}

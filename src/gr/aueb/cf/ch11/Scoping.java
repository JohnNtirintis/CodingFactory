package gr.aueb.cf.ch11;

/**
 * Demonstrates Lexical Scoping
 *
 * @author Ntirintis John
 */
public class Scoping {
    public static void main(String[] args) {
        // Lexical Scoping
        // Local Variables
        // The curly brackets define the limit of the local scoping
        int result;
        int num1 = 1;
        int num2 = 2;

        result = add(num1, num2);
        System.out.println(result);
    }

    public static int add(int num1, int num2){
        // Lexical Scoping
        // Local Variables num1, num2
        return num1 + num2;
    }

    public static int div(int num1, int num2){
        // In this example, when we init variables inside nested scopes (i.e. if, while, for)
        // the outer variables of outer scopes can access the variables of inner scopes
        // But they cant vice versa
        int result = 0;

        if(num2 == 0){
            boolean isZero = true;
            System.out.println("Is Zero: " + isZero);
            return result;
        }

        return num1 / num2;
    }
}

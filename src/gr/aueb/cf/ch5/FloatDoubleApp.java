package gr.aueb.cf.ch5;

/**
 * Prints Floats/Doubles
 *
 * @author Ntirintis John
 */
public class FloatDoubleApp {
    public static void main(String[] args) {
        float f = 3.5F;
        double d = 10.5;
        float myF = 10F;
        double myDouble = 20D;

        System.out.println(f);
        System.out.printf("f = %f, d = %f", f, d);
        System.out.printf("f = %f, d = %f", myF, myDouble);

    }
}

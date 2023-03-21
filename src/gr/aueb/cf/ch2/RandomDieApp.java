package gr.aueb.cf.ch2;

/**
 * Demonstrates The Rand Class
 */
public class RandomDieApp {
    public static void main(String[] args) {

        //Format: Math.Random() * ((Max - min + 1)) + min
        //Math.random always returns float
        //Make sure to change to integer if necessary
        int die = (int) (Math.random() * 6) + 1;

        System.out.print(die);
    }
}

package gr.aueb.cf.ch2;

import java.math.BigInteger;


/**
 * Demonstrates BigInteger Class
 */

public class AddBigIntApp {
    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("2147483647");
        BigInteger bigNum2 = new BigInteger("2147483647");
        BigInteger bigResult = new BigInteger("0");

        bigResult = bigNum1.add(bigNum2);

        System.out.printf("%,d", bigResult);

    }
}

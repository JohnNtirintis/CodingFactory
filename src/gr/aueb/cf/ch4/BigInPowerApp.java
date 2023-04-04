package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * a^n BigInteger
 *
 * @author Ntirintis John
 */
public class BigInPowerApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BigInteger a;
        BigInteger n;
        BigInteger result = new BigInteger("1");

        System.out.println("Base and power:");
        a = BigInteger.valueOf((in.nextInt()));
        n = BigInteger.valueOf((in.nextInt()));

        for(int i = 1; i <= n.intValue(); i++){
            result = result.multiply(a);
        }

        System.out.printf("%d ^ %d = %d", a,n, result);

    }
}

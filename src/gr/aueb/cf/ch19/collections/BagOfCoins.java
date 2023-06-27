package gr.aueb.cf.ch19.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ntirintis John
 */
public class BagOfCoins {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        Set<String> cities2 = new HashSet<>(List.of("Athens","London", "Paris", "Paris"));

        bag.add("Athens");
        // Set's dont allow multiples
        bag.add("Athens");
        bag.add("Paris");
        bag.add("London");

        bag.remove("London");

        bag.forEach(System.out::println);
        cities2.forEach(System.out::println);
    }
}

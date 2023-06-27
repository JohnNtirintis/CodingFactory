package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 3.3, 1), new Product("Oranges", 5, 1), new Product("Ketchup", 1.2, 3)));

        Collections.sort(products);
        products.forEach(System.out::println);
    }

}

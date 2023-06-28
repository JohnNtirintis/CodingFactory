package gr.aueb.cf.ch19.sorting;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        // Returns unmodifiable list
        List<Product> products = new ArrayList<>(List.of(new Product("Milk", 3.3, 1), new Product("Oranges", 5, 1), new Product("Ketchup", 1.2, 3)));

        // Returns an unmodifiable list
        List<Product> newProducts = Arrays.asList(new Product("Milk", 3.3, 1), new Product("Oranges", 5, 1), new Product("Ketchup", 1.2, 3));


        List<String> productDescriptions = products.stream()
                .filter(p -> p.getQuantity() >= 1)
                .map(Product::getDescription)
                .sorted()
                .collect(Collectors.toList());

        Set<String> cities = new HashSet<>(List.of("Athens", "Berlin", "Moscow"));

        Set<String> nonGreekCities = cities.stream()
                .filter(city -> !city.equals("Athens"))
                .collect(Collectors.toSet());

        List<Product> lengthFiltered = products.stream()
                .filter(product -> product.getDescription().length() <= 5) // predicate
                .collect(Collectors.toList());

        lengthFiltered.forEach(System.out::println);

        List<Product> applesList = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());

        applesList.forEach(System.out::println);


        int sumOfQuantities = products.stream()
                .filter(p -> p.getDescription().equals("Apples"))
                .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        int sumOfQuantities2 =  products.stream()
                .filter(p -> p.getDescription().equals("Apples"))
                .mapToInt(Product::getQuantity)
                .sum();


    }

}

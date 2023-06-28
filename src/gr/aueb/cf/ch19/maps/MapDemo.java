package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ntirintis John
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        Map<String, String> countries2 = new HashMap<>() {{
            put("GR", "Greece");
            put("FR", "France");
        }};

        // Available from JDK9 and after
        Map<String, String> countries3 = Map.of("GR", "Greece", "FR", "France");

        Map<Integer, Product> products = new HashMap<>() {{
            put(1, new Product("Apples", 5.5, 5));
            put(2, new Product("Oranges", 4, 6));
            put(3, new Product("Milk", 2.4, 1));
            put(4, new Product("Flour", 2.5, 1));
        }};

        Map<String, Object> criteria = new HashMap<>() {
            {
                put("description", "Oranges");
                put("price", 5.0);
                put("quantity", 2);
            }
        };

        String choice = products.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description"))
                && (Double.compare(product.getPrice(), (double) criteria.get("price"))) >= 0) //typecase from object to double
                .map(Product::toString)
                        .collect(Collectors.joining(", "));



        String strProducts = products.entrySet().stream()
                        .filter(entry -> entry.getValue().getDescription().equals("Apples"))
                        .map(Objects::toString)
                        .collect(Collectors.joining(", "));

        countries.put("GR", "Greece");
        countries.put("FR", "France");

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            if(entry.getValue().equals("Greece")){
                it.remove();
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for(Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

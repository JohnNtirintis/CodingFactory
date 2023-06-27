package gr.aueb.cf.ch19.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        Iterator<String> it = cities.iterator();

        for(int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        for(String s: cities){
            System.out.println(s);
        }

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        cities.forEach(System.out::println);

        while(it.hasNext()){
            if(it.next().equals("London")){
                it.remove();
            }
        }

        cities.removeIf(s -> s.equals("Paris"));
    }
}

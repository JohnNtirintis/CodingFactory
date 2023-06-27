package gr.aueb.cf.ch19;

import java.util.List;

/**
 * @author Ntirintis John
 */
public class GenericMethodApp {
    public static void main(String[] args) {
        Integer[] arrInt = {1,2,3};
        printArr(arrInt);

    }

    public static <T> void printArr(T[] arr){
        for(T item : arr){
            System.out.println(item);
        }
    }

    public static void print(GenericNode<?> node){
        System.out.println(node.getValue());
    }

    // PECS - Producer-Extends Consumer-Super
    public static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src){
        for(T t: src){
            list.add(t);
        }
    }
}

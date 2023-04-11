package gr.aueb.cf.ch5;

/**
 * Overloads methods
 *
 * @author Ntirintis John
 */
public class OverloadingApp {
    public static void main(String[] args) {

//      It differentiates the methods,
//      by their params
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1L,2));
        System.out.println(add(1L,2L));
    }

//    When it comes to methods, it also matters
//    what parameters they take
//    methods with the same name but different params
//    won't be considered the same
//    These methods are called Overloaded
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static long add(long a, int b){
        return a + b;
    }

    public static long add(long a, long b){
        return a + b;
    }
}

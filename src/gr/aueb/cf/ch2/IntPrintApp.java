package gr.aueb.cf.ch2;

import java.sql.SQLOutput;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 12;

        //ctrl + /
        //You can comment out in a mass manner
//        System.out.print(i);
//        System.out.println(i);
//        System.out.printf("%d", i);
//
//        System.out.print("Result = " + i);
//        System.out.println("Result = " + i);
//        System.out.printf("Result = %d \n%n", i);
//        System.out.println("hello");
//        System.out.println(" This is a test \r That was a test");

        //LEFT PADDING
        //8:24

        //Useful for dates
        System.out.printf("%030d",i);

        //Useful for numbers with many digits
        //System.out.printf("%,05d", i);



    }
}

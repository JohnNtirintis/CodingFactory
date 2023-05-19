package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Inits an array and reads data from a file.
 *
 * @author Ntirintis John
 */
public class ArrayPopulateFile {
    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];

        // Replace the path with whatever file you want.
        File intFile = new File("D:\\CodingFactory\\NumsFile.txt");

        //Notice that instead of using Scanner(System.in)
        //We used Scanner(filename)
        Scanner sc = new Scanner(intFile);

        for(int i = 0; i < ages.length; i++){
            ages[i] = sc.nextInt();
        }

        for(int age : ages){
            System.out.println(age + " ");
        }

        //Always close the file in the end
        sc.close();
    }
}

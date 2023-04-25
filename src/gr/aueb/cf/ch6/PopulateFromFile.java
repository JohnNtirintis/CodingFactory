package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Array populate from file
 *
 * @author Ntirintis John
 */
public class PopulateFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/gr/aueb/cf/ch6/text.txt");
        Scanner sc = new Scanner(file);

        int[] grades = new int[5];

        for(int i = 0; i < grades.length; i++){
            grades[i] = sc.nextInt();
        }

        for(int grade : grades){
            System.out.print(grade + " ");
        }

    }
}

package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Showcases use of StringBuilder in combination with BufferedReader
 *
 * @author Ntirintis John
 */
public class BufferedReaderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // This is known as try-with-resources
        // It will auto-close the functions that are init in the parenthesis
        // Thus saving memory and making sure there are no memory leaks
        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/buff-reader.txt"))){
            String line = "";

            while((line = bf.readLine()) != null){
                sb.append(line).append("\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(sb);
    }
}

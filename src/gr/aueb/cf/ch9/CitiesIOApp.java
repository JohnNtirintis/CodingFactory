package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * This app reads a list of countries and cities from a .txt file in a given path
 * it then creates a directory and creates a .txt file named after the country,
 * and prints/writes the name of the cities of that country in that file
 *
 * @author Ntirintis John
 */
public class CitiesIOApp {
    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/tmp/io");

        // Check to see if the given dir exists
        if(!dir.exists()){
            if(!dir.mkdir()){
                System.err.println("Error in mkdir");
                System.exit(1);
            }
        }

        try(BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))){
            File grFile, deFile, usaFile;

            // Keeps on reading while != EOF
            while((line = bf.readLine()) != null ){
                // Split the line into city names using space as the delimiter
                cities = line.split(" +");
                // The country must be the first word in each line
                // Check the first word of each line to determine the country
                switch (cities[0]){
                    case "Greece":
                        grFile = new File(dir + "/" + "gr.txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR Cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        usaFile = new File(dir + "/" + "usa.txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        deFile = new File(dir + "/" + "de.txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "De cities");
                        print(de, cities);
                        break;
                    default:
                        System.out.println("Error in cities");
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * This method prints/writes the city names into the country's file.
     * It starts from the second token because the first one is the country's name.
     *
     * @param ps the PrintStream object associated with the country file
     * @param tokens array of strings where each element is a city name
     */
    public static void print(PrintStream ps, String[] tokens){
        for(int i = 1; i < tokens.length; i++){
            ps.print(tokens[i] + " ");
        }
    }

    /**
     * This method prints/writes a single message into the country's file.
     *
     * @param ps the PrintStream object associated with the country file
     * @param message the message to be written in the file
     */
    public static void print(PrintStream ps, String message){
        ps.println(message);
    }
}

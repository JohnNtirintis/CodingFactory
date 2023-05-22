package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demonstrates the use of Exceptions.
 */
public class ExceptApp2 {
    public static void main(String[] args) {
        int ch;
        int[] arr = new int[10];

        try {
             ch = getNextChar();
            System.out.println(ch);
        }
        catch  (IOException e){
            System.out.println("Error in I/O");
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " i");
        }

    }

    public static int getNextChar() throws IOException{
        int ch = ' ';
        try {
            ch = System.in.read();
        }
        catch  (IOException e) {
            // 1. Rollback
            // 2. Logging
            e.printStackTrace();

            // 3. Rethrow
            throw e;
        }

        return ch;
    }
}
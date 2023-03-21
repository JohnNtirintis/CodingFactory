package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long result = 0L;

        //Suffers performance wise if we dont set the variable type correctly
        //We can also add a single letter type at the end of the value
        //i.e. 'l' or 'L' for long
        long num2 = 20L;

        num1 = (int) num2;

        //Java automatically sets the type of the variables
        //to the longest/biggest that is being used.
        result = num1 + num2;
    }
}

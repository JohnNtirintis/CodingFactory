package gr.aueb.cf.ch6;

/**
 * Takes an array as input ints 0 - 100
 * And prints them as grades in a chart
 *
 */
public class GradeDistributionApp {
    public static void main(String[] args) {

        int[] grades = {30, 6, 9 , 12, 22, 28, 29, 30, 39, 50, 55, 67, 70, 82, 89, 90, 91, 94, 95, 100};
        int[] count = new int[10];

        for(int grade : grades){
            if (grade == 100) count[9] += 1;
            else {
                count[grade / 10] += 1;
            }
        }

        for(int i = 0; i < count.length; i++){
            System.out.printf("%02d + %02d", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            for(int j = 1; j <= count[i]; j++){
                // Every star on the side of the numbers counts for one
                // grade that exists in that range
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

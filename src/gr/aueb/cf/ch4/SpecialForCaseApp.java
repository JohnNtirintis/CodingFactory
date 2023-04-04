package gr.aueb.cf.ch4;

/**
 * Infite for loop case
 *
 * @author Ntirintis John
 */
public class SpecialForCaseApp {
    public static void main(String[] args) {

        int counter = 0;

        for (;;){
            System.out.println("Semi-Infinite Loop Example");
            //Added this, just so it can stop at some point
            //in case a pc freezes or something
            counter++;
            if(counter % 20 == 0) System.out.println();
        }

    }
}

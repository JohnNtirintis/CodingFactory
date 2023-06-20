package gr.aueb.cf.ch17.runnable;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {

        Knight kingArthur = new Knight("King Arthur");
        Knight sirKnightALot = new Knight("Sir Knights A Lot");
        Knight guistiniani = new Knight("Giovanni Guistiniani");

        (new Thread(kingArthur)).start();
        (new Thread(sirKnightALot)).start();
        (new Thread(guistiniani)).start();
    }
}

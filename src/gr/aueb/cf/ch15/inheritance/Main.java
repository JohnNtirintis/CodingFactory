package gr.aueb.cf.ch15.inheritance;

import static gr.aueb.cf.ch15.inheritance.Point.doMovePlus10;
import static gr.aueb.cf.ch15.inheritance.Point.doPrint;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        // late binding
        // The choice of the suitable/correct movePlus10() happens
        // during run-time
        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        // p2 is a pointer to Point
        // Which means with p2 we can call all virtual/override functions of the root class Point
        // On the other hand, we cant directly call methods from Point2D that dont belong in Point
        // i.e. getY, setY.
        // That is only possible with down-casting
        // See below:
        ((Point2D) p2).setY(12);

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);
    }


}

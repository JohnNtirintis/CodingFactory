package gr.aueb.cf.ch12.composition;

import gr.aueb.cf.ch12.Circle;
import gr.aueb.cf.ch12.immutable.ImmutableCircle;
import gr.aueb.cf.ch12.immutable.ImmutableCircle2;
import gr.aueb.cf.ch12.immutable.ImmutablePoint;
import gr.aueb.cf.ch12.immutable.Point;

/**
 * @author Ntirintis John
 */
public class CircleApp {
    public static void main(String[] args) {
        Point center1 = new Point(1,2);
        ImmutablePoint center2 = new ImmutablePoint(4, 3);

        Circle circle1 = new Circle(center1, 33);

        ImmutableCircle circle2 = new ImmutableCircle(center1, 10);
        ImmutableCircle2 circle3 = new ImmutableCircle2(center2, 10);

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(circle3.toString());
    }
}

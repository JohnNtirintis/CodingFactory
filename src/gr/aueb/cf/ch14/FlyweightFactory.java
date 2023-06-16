package gr.aueb.cf.ch14;

import java.util.ArrayList;
import java.util.List;

/**
 * No instances of this class should be available (utility class)
 *
 * this is also a facade design patter. It provides a simplified interface
 * to a set of classes: {@link gr.aueb.cf.ch12.immutable.ImmutablePoint}
 * and {@link gr.aueb.cf.ch12.immutable.ImmutableCircle}
 *
 * At the sae time, this specific implementation of facade
 * implements the flyweight pattern
 *
 * @author Ntirintis John
 */
public class FlyweightFactory {
    // The following lists are acting like caches of the generated objects
    private static final List<ImmutablePoint> points = new ArrayList<>();
    private static final List<ImmutableCircle> circles = new ArrayList<>();

    private FlyweightFactory() {}

    /**
     * Returns an instance of ImmutablePoint with the specified coordinates.
     * If an instance with the same coordinates already exists, that instance
     * is returned instead of creating a new one.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @return an instance of ImmutablePoint with the specified coordinates
     */
    public static ImmutablePoint getPoint(int x, int y){
        ImmutablePoint point = null;

        if(!pointExists(x,y, point)){
            point =  new ImmutablePoint(x, y);
            points.add(point);
        }

        return point;
    }

    /**
     * Returns an instance of ImmutableCircle with the specified center and radius.
     * If an instance with the same center and radius already exists, that instance
     * is returned instead of creating a new one.
     *
     * @param center the center of the circle
     * @param radius the radius of the circle
     * @return an instance of ImmutableCircle with the specified center and radius
     */
    public static ImmutableCircle getCircle(ImmutablePoint center, int radius){
        ImmutableCircle circle = null;

        if(!circleExists(center, radius, circle)){
            circle = new ImmutableCircle(center, radius);
            circles.add(circle);
        }

        return circle;
    }

    /**
     * Checks if an ImmutablePoint with the specified coordinates already exists in the list.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @param point an existing ImmutablePoint instance to be checked
     * @return true if an ImmutablePoint with the specified coordinates exists, false otherwise
     */
    private static boolean pointExists(int x, int y, ImmutablePoint point){
        boolean found = false;
        point = null;

        for(ImmutablePoint p : points){
            if((p.getX() == x) && (p.getY() == y)){
                point = p;
                found = true;
                break;
            }
        }

        return found;
    }

    /**
     * Checks if an ImmutableCircle with the specified center and radius already exists in the list.
     *
     * @param point the center of the circle
     * @param radius the radius of the circle
     * @param circle an existing ImmutableCircle instance to be checked
     * @return true if an ImmutableCircle with the specified center and radius exists, false otherwise
     */
    private static boolean circleExists(ImmutablePoint point, int radius, ImmutableCircle circle){
        boolean found = false;
        circle = null;

        for(ImmutableCircle c : circles) {
            if((c.getCenter() == point) && (c.getRadius() == radius)){
                circle = c;
                found = true;
                break;
            }
        }

        return found;
    }
}

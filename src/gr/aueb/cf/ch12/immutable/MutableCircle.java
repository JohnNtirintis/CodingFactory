package gr.aueb.cf.ch12.immutable;

import gr.aueb.cf.ch12.Circle;

/**
 * Mutable Circle
 *
 * @author Ntirintis John
 */
public class MutableCircle {
    private Point center;
    private int radius;

    public MutableCircle() {}

    public MutableCircle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MutableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

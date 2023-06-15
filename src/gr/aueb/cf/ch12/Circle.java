package gr.aueb.cf.ch12;


import gr.aueb.cf.ch12.model.Point;

/**
 * Aggregation / Composition (Strict aggregation)
 *
 * @author Ntirintis John
 */
public class Circle {
    private Point center;
    private int radius;

    public Circle() {}

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(gr.aueb.cf.ch12.immutable.Point center1, int radius) {
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

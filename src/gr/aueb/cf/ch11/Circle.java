package gr.aueb.cf.ch11;


/**
 * Aggregation / Composition (Strict aggregation)
 *
 * @author Ntirintis John
 */
public class Circle {
    private Point center;
    private int radius;


    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
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

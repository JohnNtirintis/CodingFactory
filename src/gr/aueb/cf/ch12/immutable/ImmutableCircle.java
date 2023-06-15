package gr.aueb.cf.ch12.immutable;

/**
 * Immutable Circle with Composition
 * of mutable object.
 *
 * @author Ntirintis John
 */
public class ImmutableCircle {
    private final Point center;
    private final int radius;

    public ImmutableCircle(){
        center = new Point();
        radius = 0;
    }

    // Overloaded Constructor
    // Deep Copy (?)
    public ImmutableCircle(Point center, int radius){
        this.center = new Point(center.getX(), center.getY());
        this.radius =  radius;
    }

    public ImmutableCircle(ImmutablePoint center, int radius, Point center1, int radius1) {
        this.center = center1;
        this.radius = radius1;
    }

    // Deep copy (?)
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "ImmutableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

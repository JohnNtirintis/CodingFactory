package gr.aueb.cf.ch15.inheritance;

/**
 * @author Ntirintis John
 */
public class Point2D extends Point {

    private double y;

    public Point2D() {
        // Calls the default constructor of the parent class @Point
        super();
        y = 0;
    }

    public Point2D(double x, double y) {
        // Calls the overloaded constructor of the parent class @Point
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y +
                '}';
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}

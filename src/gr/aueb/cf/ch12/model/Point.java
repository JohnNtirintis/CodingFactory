package gr.aueb.cf.ch12.model;

/**
 * The point class represents points in a 2D space,
 * Where x and y coordinates are ints
 * All points such as (0,0) or (24,33) could be implemented as
 * instances of this class
 *
 * @author Ntirintis John
 */
public class Point {

    private int x;
    private int y;

    /**
     * Inits a newly created point,
     * so that it represents a (0,0) point.
     * JVM handles it
     *
     */
    public Point() {}

    /**
     * Overloaded constructor
     * Constructs a new point with specific x,y coordinates
     *
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

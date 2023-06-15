package gr.aueb.cf.ch12.immutable;

/**
 * Immutable Point
 *
 * @author Ntirintis John
 */
public class ImmutablePoint {

    private int x;
    private int y;

    /**
     * Inits a newly created point,
     * so that it represents a (0,0) point.
     * JVM handles it
     *
     */
    public ImmutablePoint() {}

    /**
     * Overloaded constructor
     * Constructs a new point with specific x,y coordinates
     *
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public ImmutablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

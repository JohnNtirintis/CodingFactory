package gr.aueb.cf.ch14;

/**
 * @author Ntirintis John
 */
public class ImmutableCircle {
    private final ImmutablePoint center;
    private final int radius;

    ImmutableCircle(){
        center = new ImmutablePoint();
        radius = 0;
    }

    ImmutableCircle(ImmutablePoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public ImmutablePoint getCenter() {
        return center;
    }

    public int getRadius() {
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

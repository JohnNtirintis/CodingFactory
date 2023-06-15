package gr.aueb.cf.ch12.immutable;

/**
 * @author Ntirintis John
 */
public class ImmutableCircle2 {
    private final ImmutablePoint center;
    private final int radius;

    public ImmutableCircle2() {
        center = new ImmutablePoint();
        radius = 0;
    }

    public ImmutableCircle2(ImmutablePoint center, int radius){
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
        return "ImmutableCircle2{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

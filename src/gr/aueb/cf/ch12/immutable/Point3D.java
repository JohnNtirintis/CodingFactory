package gr.aueb.cf.ch12.immutable;

import gr.aueb.cf.ch12.Point3d;

/**
 * Immutable Point3D
 *
 * Point field refers to mutable object.
 * 1. Never init such a field to a client provided reference
 * 2) Never return this field from an accessor (getter)
 *
 * Instead, make deep copies
 *
 * @author Ntirintis John
 */
public class Point3D {
    private final Point point;
    private final int z;

    public Point3D(Point point, int z){
        this.point = new Point(point.getY(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ(){
        return z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "point=" + point +
                ", z=" + z +
                '}';
    }
}

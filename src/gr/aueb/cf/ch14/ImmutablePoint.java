package gr.aueb.cf.ch14;

import gr.aueb.cf.ch12.immutable.ImmutableCircle;

/**
 * @author Ntirintis John
 */
public class ImmutablePoint {
    private final int x;
    private final int y;

    ImmutablePoint(){
        x = 0;
        y = 0;
    }

    ImmutablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

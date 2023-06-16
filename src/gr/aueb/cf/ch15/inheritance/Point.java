package gr.aueb.cf.ch15.inheritance;

/**
 * Is a root superclass for Point2D and Point3D
 *
 * @author Ntirintis John
 */
public class Point {

    private double x;

    public Point() {}

    public Point(double x ){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }

    /**
     * It's a polymorphic method.
     * That is a method that may get many forms of input
     * Not only point but also Point2D and Point3D
     * <br>
     * It is agnostic of the type of point.
     * It accepts any point in the inheritance hierarchy.
     *
     * @param point a Point instance or any type of Instance
     *              in the inheritance hierarchy of Point.
     */
    public static void doMovePlus10(Point point){
        point.movePlus10();
    }

    /**
     * Similarly to doMovePlus10 (see above)
     * This is a polymorphic method that can get many forms
     * It will change the return depending on the point
     * i.e. if its Point, Point2D or Point3D.
     *
     * @param point  prints any given point
     */
    public static void doPrint(Point point){
        System.out.println(point);
    }

    public void movePlus10(){
        for(int i = 1; i <= 10; i++){
            movePlusOne();
        }
    }

    protected void movePlusOne(){
        x++;
    }

    protected void printTypeOf(){
        System.out.println(this.getClass().getSimpleName());
    }

    private void reset(){
        x = 0;
    }
}

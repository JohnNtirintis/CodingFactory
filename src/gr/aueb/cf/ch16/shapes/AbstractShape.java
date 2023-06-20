package gr.aueb.cf.ch16.shapes;

/**
 * @author Ntirintis John
 */
public abstract class AbstractShape implements IShape {

    private long id;

    @Override
    public long getID() {
        return 0;
    }

    public void setId(long id){
        this.id = id;
    }
}

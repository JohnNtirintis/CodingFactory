package gr.aueb.cf.ch13.model;

import java.util.Date;

/**
 * @author Ntirintis John
 */
public class TimePeriod {
    private Long id;
    private Date start;
    private Date end;

    public TimePeriod() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}

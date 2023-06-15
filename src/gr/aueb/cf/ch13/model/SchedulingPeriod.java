package gr.aueb.cf.ch13.model;

import java.time.Duration;

/**
 * @author Ntirintis John
 */
public class SchedulingPeriod {
    private Long id;
    private TimePeriod timePeriod;
    private Long minutesDurations;
    private String formattedDuration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Long getMinutesDurations() {
        return minutesDurations;
    }

    public void setMinutesDurations(Long minutesDurations) {
        this.minutesDurations = minutesDurations;
    }

    public String getFormattedDuration() {
        return formattedDuration;
    }

    public void setFormattedDuration(String formattedDuration) {
        this.formattedDuration = formattedDuration;
    }

    public SchedulingPeriod(TimePeriod timePeriod){

        this.timePeriod = timePeriod;
        Duration duration = Duration.between(timePeriod.getStart().toInstant(), timePeriod.getEnd().toInstant());
        minutesDurations = duration.toMinutes();
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();

        if(hours > 0){
            this.formattedDuration = hours + " " + ((hours == 1) ? "hour" : "hours");
        }
        if(minutes > 0){
            this.formattedDuration = minutes + " " + ((minutes == 1) ? "hour" : "hours");
        }


    }
}

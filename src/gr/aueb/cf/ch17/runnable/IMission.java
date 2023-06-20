package gr.aueb.cf.ch17.runnable;

/**
 * @author Ntirintis John
 */
public interface IMission {
    MissionStatus getStatus();

    void setStatus(MissionStatus status);
    void embark();
}

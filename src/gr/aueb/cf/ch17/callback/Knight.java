package gr.aueb.cf.ch17.callback;

/**
 * @author Ntirintis John
 */
public class Knight implements IKnight
{
    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}

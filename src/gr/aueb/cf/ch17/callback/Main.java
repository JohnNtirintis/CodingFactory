package gr.aueb.cf.ch17.callback;

/**
 * @author Ntirintis John
 */
public class Main {

    public static void main(String[] args) {

        IKnight sirKnightALot = new Knight();
        IKnight giovanniGiustiniani = new Knight();

        sirKnightALot.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Go to knight things and look cool.");
            }
        });

        giovanniGiustiniani.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                protectConstantinople();
            }
        });
    }

    public static void protectConstantinople(){
        System.out.println("1453 is now, defend the city!");
    }
}

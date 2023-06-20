package gr.aueb.cf.ch17.callback;

/**
 * @author Ntirintis John
 */
public class KnightApp {
    public static void main(String[] args) {

        IKnight zhaoZilong = new Knight();
        IKnight maChao = new Knight();

        // Lambda Expressions
        zhaoZilong.embarkOnMission(() -> System.out.println("Save Liu Shan"));
        zhaoZilong.embarkOnMission(() -> saveLiuShan());

        maChao.embarkOnMission(() -> avengeYourFather());

        // Method References
        zhaoZilong.embarkOnMission(KnightApp::saveLiuShan);
        maChao.embarkOnMission(KnightApp::avengeYourFather);
    }

    public static void saveLiuShan(){
        System.out.println("Save Liu Shan");
    }

    public static void avengeYourFather(){
        System.out.println("Avenge your father by finding the murderer.");
    }

}

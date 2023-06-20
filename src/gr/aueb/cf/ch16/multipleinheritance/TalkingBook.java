package gr.aueb.cf.ch16.multipleinheritance;

/**
 * @author Ntirintis John
 */
public class TalkingBook implements ISpeakable, IReadable{

    @Override
    public void read() {
        System.out.println("Read");
    }

    @Override
    public void speak() {
        System.out.println("Speak");
    }
}

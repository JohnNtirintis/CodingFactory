package gr.aueb.cf.ch16;

/**
 * @author Ntirintis John
 */
public class Main {

    public static void main(String[] args) {
        // Polymorphism
        ISpeakable luna = new Cat();
        ISpeakable simba = new Dog();

        luna.speak();
        simba.speak();
    }

    // Polymorphic method
    public static void doSpeak(ISpeakable speakable){
        speakable.speak();
    }
}

package gr.aueb.cf.ch16;

/**
 * @author Ntirintis John
 */
public class SpeakingSchool {

    // This is difficult to test
    // And it's not so scalable and reusable
    // That's why we use Dependency Injection
    // SEE: GenericSpeakingApplication.java
    private Cat cat = new Cat();

    public SpeakingSchool() {}

    public void learnToSpeak(){
        cat.speak();
    }
}

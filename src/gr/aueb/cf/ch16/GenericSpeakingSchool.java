package gr.aueb.cf.ch16;

/**
 * @author Ntirintis John
 */
public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    // Dependency Injection
    // IoC = Inversion of Control
    public GenericSpeakingSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void learnToSpeak(){
        speakable.speak();
    }
}

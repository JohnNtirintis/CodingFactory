package gr.aueb.cf.ch16;

/**
 * @author Ntirintis John
 */
public class SpeakingSchoolApp {

    ISpeakable whiteCat = new Cat("White Cat");
    ISpeakable blackDog = new Dog("Black Dog");

    // Wiring
    GenericSpeakingSchool catSchool =  new GenericSpeakingSchool(whiteCat);
    GenericSpeakingSchool dogSchool =  new GenericSpeakingSchool(blackDog);


}

package gr.aueb.cf.ch16.functionalinterfaces;

/**
 * @author Ntirintis John
 */
public interface IDChecker {

    // boolean functions are also called Predicates

    /**
     * Checks for specific student ids
     *
     * @param student the {@link Student} instance
     * @return true if the id of the student is valed based on the predicate,
     * otherwise it retuns false
     */
    boolean checkID(Student student);
}

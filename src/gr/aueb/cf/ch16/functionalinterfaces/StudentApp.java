package gr.aueb.cf.ch16.functionalinterfaces;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * @author Ntirintis John
 */
public class StudentApp {
    public static void main(String[] args) {

    }

    public static void printStudents(Student[] students, IDChecker checker){
        for(Student student : students){
            if(checker.checkID(student)){
                System.out.println(student);
            }
        }
    }
}

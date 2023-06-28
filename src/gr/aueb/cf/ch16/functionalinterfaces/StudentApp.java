package gr.aueb.cf.ch16.functionalinterfaces;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Ntirintis John
 */
public class StudentApp {
    public static void main(String[] args) {
        Student[] students;
        students = new Student[] {
                new Student(1, "Daniel", "Ricciardo"),
                new Student(2, "Fernando", "Alonso"),
                new Student(3, "Oscar", "Piastri"),
                new Student(4, "Valterri", "Bottas")
        };

//        printStudents(students, new IDChecker() {
//            // Anonymous Class/Function ?
//            // The reason for this anonymous func is that we will need/use it only once
//            @Override
//            public boolean checkID(Student student) {
//                return student.getId() >= 3;
//            }
//        });

        // Lambda
        // Implements checkID using Lambda
        // (student) is the param that checkID needs
        // And it returns the id of the student
        // if its equal or less than 2
//        printStudents(students, (student) -> student.getId() <= 2);

        // Alternative Way 1
        printStudents(students, (st) -> st.getId() <= 2, (student -> student.printStudent()));
        printStudents(students, (st) -> st.getId() == 2, student -> student.printStaticStudent(student));

        printStudents(students, (st) -> st.getId() <= 2, Student::printStudent);
        printStudents(students, (st) -> st.getId() == 2, Student::printStaticStudent);
        // Alternative Way 2
//        printStudents(students, (student) -> {return student.getId() <= 2;});

    }

    // Boiler Plate function?
//    public static void printStudents(Student[] students, IDChecker checker){
//        for(Student student : students){
//            // predicate
//            if(checker.checkID(student)){
//                System.out.println(student);
//            }
//        }
//    }

    public static void printStudents1(Student[] students, Predicate<Student> checker){
        for(Student student : students){
            // predicate
            if(checker.test(student)){
                System.out.println(student);
            }
        }
    }

    public static void printStudents(Student[] students, Predicate<Student> checker, Consumer<Student> action){
        for(Student student : students){
            if(checker.test(student)){
                action.accept(student);
            }
        }
    }
}

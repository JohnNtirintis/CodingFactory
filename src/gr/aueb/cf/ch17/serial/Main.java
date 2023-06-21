package gr.aueb.cf.ch17.serial;

import java.io.*;

/**
 * @author Ntirintis John
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:/tmp/serial-codes.ser");
        Student student = new Student(1, "George", "Washington");
        writeObj(student, file);

        Student student1;
        student1 = readObj(file);
        System.out.println(student1);
    }

    public static void writeObj(Student stu, File file){
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(stu);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Student readObj(File file){
        Student student = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            student = (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return student;
    }
}

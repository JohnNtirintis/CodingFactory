package gr.aueb.cf.ch14;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author Ntirintis John
 */
public class ReflectionTeacherApp {
    public static void main(String[] args) {
        try{
            // Load Class
            Class<?> clazz = Class.forName("testbed.ch14.Teacher");

            // Get default constructor and create an instance
            Constructor<?> defaultCtr = clazz.getConstructor();
            Teacher teacher1 = (Teacher) defaultCtr.newInstance();

            // Get overloaded constructor and create an instance
            Constructor<?> intCtr = clazz.getConstructor(Long.class);
            Teacher teacher2 =  (Teacher) intCtr.newInstance(10L);

            // Get method sayHello and invoke sayHello on rApp1 instance
            Method sayHello = clazz.getMethod("sayHello");
            sayHello.invoke(teacher1);

            // Get method saySomething and invoke it on rApp2 instance
            Method saySomething = clazz.getMethod("saySomething", String.class);
            saySomething.invoke(teacher2, "Coding Factory");
            System.out.println();

            // Get Public Constructors otherwise use getDeclaredConstructors
            Constructor<?>[] ctrList = clazz.getConstructors();
            System.out.println(Arrays.toString(ctrList));
            System.out.println();

            // Get public, private, protected, default methods
            Method[] mList = clazz.getDeclaredMethods();
            for(Method m : mList){
                System.out.println("Method name: " + m.getName());
            }
            System.out.println();

            // Get public, private, protected, default fields
            Field[] fList = clazz.getDeclaredFields();
            for(Field f: fList){
                System.out.println("Field name: " + f.getName());
                int mod =  f.getModifiers();
                System.out.println(Modifier.toString(mod));
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}

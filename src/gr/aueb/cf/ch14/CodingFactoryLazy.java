package gr.aueb.cf.ch14;

/**
 * Defines a singleton coding factory
 * with lazy instantiation
 *
 * @author Ntirintis John
 */
public class CodingFactoryLazy {
//    Singleton pattern restricts the instantiation of a class
//    and ensures that only one instance of the class
//    exists in the Java Virtual Machine.
    private static CodingFactoryLazy SINGLETON = null;

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance(){
        if(SINGLETON == null){
            SINGLETON = new CodingFactoryLazy();
        }
        return SINGLETON;
    }

    public void sayHello(){
        System.out.println("Hi!");
    }
}

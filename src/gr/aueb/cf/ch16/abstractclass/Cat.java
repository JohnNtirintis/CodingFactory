package gr.aueb.cf.ch16.abstractclass;

/**
 * @author Ntirintis John
 */
public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Hello, meow.");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" cat food");
    }

    @Override
    public String toString() {
        return getId() + ", " +getName();
    }
}

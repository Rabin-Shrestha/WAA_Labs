package CoreJava;

/**
 * Created by Rabin Shrestha on 1/10/2018.
 */
public abstract class AbstractDemo {


    AbstractDemo(){}
    Integer instanceVariable;

    /*Abstract class can have abstract method with abstract keyword */
    abstract void abstractMethod_1();
    abstract void abstractMethod_2();
    static void staticMethod_insideAbstractClass(){
        System.out.println("Static method inside abstract class in possible");
    }

    void instanceMethod_withDefination(){
        System.out.println("Method implementatio inside abstract class");
    }

}
class childAbstract extends AbstractDemo{

    @Override
    void abstractMethod_1() {
        System.out.println("Child Impl 1");
    }

    @Override
    void abstractMethod_2() {
        System.out.println("Child Impl 2");

    }
}

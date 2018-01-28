package CoreJava;

/**
 * Created by Rabin Shrestha on 1/10/2018.
 */
public interface InterfaceDemo {
    public Integer InitializedinstanceVariable=90;
    /*All declared method inside interface are by default public abstract and they need to be overridden by its child class*/
    void method1();
    void method2();
    static void staticMethod(){
        System.out.println("static method inside Interface");
    }
    default void defaultMethodJava8(){
        System.out.println("Default method in java 8 : Prior to java 8 it was not possible");
    }
}
class child implements InterfaceDemo{

    @Override
    public void method1() {
        System.out.println("mehod imp 1");
    }

    @Override
    public void method2() {
        System.out.println("method impl 2");

    }
}

package CoreJava;

import java.util.Comparator;

/**
 * Created by Rabin Shrestha on 11/13/2017.
 */
public interface Java8Interface {
    static void myStaticMehtod() {
        System.out.println("This is static mehtod inside Interface");
    }

    default void myDefaultMethod() {
        System.out.println("This is the default method inside Interface");
    }

}

class Test implements Java8Interface {
    public static void main(String[] args) {
        Java8Interface.myStaticMehtod();
        new Test().myDefaultMethod();
    }

    public void myDefaultMethod() {
        System.out.println("This is the default method inside child");
    }
}

class Employee implements Comparable<Employee>
{
    String name;
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}


class myComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
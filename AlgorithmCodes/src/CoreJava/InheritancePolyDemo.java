package CoreJava;

import javax.lang.model.util.Types;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rabin Shrestha on 11/11/2017.
 */
public class InheritancePolyDemo<T extends Vehicle> {

    public static void main(String[] args) {

       InheritancePolyDemo<Car> carInheritancePolyDemo =new InheritancePolyDemo<>();
        System.out.println(carInheritancePolyDemo.getClass().getTypeName());

        List<Vehicle> list = new ArrayList<>();
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        Vehicle v3 = new Car();
        Vehicle v4 = new Bike();


        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);

        for (Vehicle v : list) {
            v.addWheels();
            System.out.println(v.toString() + "==> No of Wheels " + v.getNoOfWheel());
        }
    }
}

class Bike extends Vehicle {

    public Bike() {
        super("Bike");
    }

    @Override
    void addWheels() {
        super.addWheels(2);
    }
}

class Car extends Vehicle {

    public Car() {
        super("Car");
    }

    @Override
    void addWheels() {
        super.addWheels(4);
    }
}

abstract class Vehicle{
    String name;
    Integer noOfWheel = 0;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", noOfWheel=" + noOfWheel +
                '}';
    }

    void addWheels(Integer n) {
        this.noOfWheel = n;
    }

    abstract void addWheels();

    public Integer getNoOfWheel() {
        return noOfWheel;
    }
}

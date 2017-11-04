package models.names;

/**
 * Created by Rabin Shrestha on 11/1/2017.
 */
public class Person {
    String firstName;
    String LastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        LastName = lastName;
    }
}


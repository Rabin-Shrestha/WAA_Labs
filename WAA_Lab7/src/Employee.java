import javax.faces.context.FacesContext;
import java.util.Map;

/**
 * Created by manozct on 12/17/2017.
 */
public class Employee {
    private String id;
    private String name;
    private String phone;
    private Double salary;

    public Employee() {
    }

    public Employee(String id, String name, String phone, Double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}

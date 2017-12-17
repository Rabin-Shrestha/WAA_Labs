package ManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/15/2017.
 */
@ManagedBean
@RequestScoped
public class EmployeDetails {

    List<Employee> employeeList=new ArrayList<>();
    public EmployeDetails()
    {

    }


}


class Employee
{
    String name;
    String id;
    String phone;
    Double salary;
    public Employee()
    {}
    public Employee()
    {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

package ManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Rabin Shrestha on 12/15/2017.
 */
@ManagedBean(name = "employeeDetails")
@RequestScoped
public class EmployeeDetails {



    private List<Employee> employeeList;
    Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDetails() {

        employeeList = new ArrayList<>();
        employeeList.add(new Employee("1432", "Frank Brown", "625-345-2635", 45089.5));
        employeeList.add(new Employee("1321", "John Doe", "625-345-3321", 56003.0));
        employeeList.add(new Employee("1634", "Mary Jones", "625-345-3421", 73998.3));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployee()
    {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String employeeId = params.get("eid");
        System.out.println("The Selected Employee ID : "+ employeeId);
        for (Employee employee : employeeList) {
            if (employee.getId().equals(employeeId)) {
                System.out.println("The Selected Employee Details");
                System.out.println(employee.getId());
                System.out.println(employee.getName());
                System.out.println(employee.getSalary());
                this.employee=employee;
                return employee;
            }
        }
        this.employee=employeeList.get(0);

        return employeeList.get(0);
    }


}



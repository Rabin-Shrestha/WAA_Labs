import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by manozct on 12/17/2017.
 */
@ManagedBean
@RequestScoped
public class
DataTable {
    private List<Employee> employeeList;

    public DataTable(){

        employeeList=new ArrayList<>();
        employeeList.add(new Employee("1432","Frank Brown","625-345-2635",45089.5));
        employeeList.add(new Employee("1321","John Doe","625-345-3321",56003.0));
        employeeList.add(new Employee("1634","Mary Jones","625-345-3421",73998.3));


    }

    public List<Employee> getEmployeeList(){

        return employeeList;
    }
    public Employee getEmployee()
    {
        Map<String, String> params= FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String employeeId=params.get("eid");
        System.out.println(employeeId);
        for (Employee employee:employeeList) {
            if(employee.getId().equals(employeeId)){
                System.out.println("inside loop");
                System.out.println(employee.getId());
                System.out.println(employee.getName());
                System.out.println(employee.getSalary());
                return employee;
            }

        }
        return null;


    }



}

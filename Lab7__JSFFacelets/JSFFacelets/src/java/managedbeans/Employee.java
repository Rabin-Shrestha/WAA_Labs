package managedbeans;

public class Employee {
    private String id;
    private String name;
    private String phone;
    private double salary;
    
    public Employee() {
    }

    public Employee(String id, String name, String phone, double salary) {
      this.id=id;
      this.name=name;
      this.phone=phone;
      this.salary=salary;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

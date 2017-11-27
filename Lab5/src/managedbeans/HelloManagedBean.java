package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Rabin Shrestha on 11/26/2017.
 */
@ManagedBean
@RequestScoped
public class HelloManagedBean {
    private String name;
    public HelloManagedBean(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String sayHello()
    {
        System.out.println(" Hello there"+this.name);
        return null;
    }
}

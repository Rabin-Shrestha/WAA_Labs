package managedbeans;



import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class TemperatureManagedBean {
    private Date date = new Date();
    private Temperature temp= null;

    public String showresult() {
        return "result";
    }


    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

}

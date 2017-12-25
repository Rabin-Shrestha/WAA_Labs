package ManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Rabin Shrestha on 12/24/2017.
 */
@ManagedBean(name="DataBean")
@RequestScoped
public class MyDataBean {
    String date;
    String temprature;

    public MyDataBean() {
    }

    public String getDate() {
       // LocalDate ld=LocalDate.parse(date);
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }
    public String goToResult()
    {
        return "convertedDataResult.xhtml";
    }

}

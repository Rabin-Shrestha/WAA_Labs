package ManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Rabin Shrestha on 12/24/2017.
 */
@ManagedBean(name="CarBean")
@RequestScoped
public class MyCarBean {
    String brand;
    String licenseNo;
    Double price;

    public MyCarBean() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String validateData()
    {
        return "validatedDataResult.xhtml";
    }
}

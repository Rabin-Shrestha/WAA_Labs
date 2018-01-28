package managedbeans;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class CarInfo {
   private String brand="";
   private String licence="";
   private long price=0;

    public String submit() {
        return null;
    }

    public void validateBrand(FacesContext context, UIComponent toValidate, Object value) {
            String brand = (String) value;
            if (!(brand.equalsIgnoreCase("Mercedes") || brand.equalsIgnoreCase("BMW"))) {
              ((UIInput)toValidate).setValid(false);
                FacesMessage message = new FacesMessage("Invalid Brand");
                context.addMessage(toValidate.getClientId(context), message);
            }
        }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

}

package converter;


import managedbeans.Temperature;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter( value="TempConverter" )
public class TempConverter implements Converter {
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
         if ("".equals(value)){
              return null;
         }
       
        String temptype = value.substring(0,1);
        String tempvalue= value.substring(1);
        Temperature temp = new Temperature(tempvalue, temptype);
        return temp;

    }
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Temperature temp = (Temperature) value;
        
        if (temp.getTemptype().equals("F"))
         return temp.getTemp()+ " Fahrenheit";
         else{
             return temp.getTemp()+ " Celcius";
         }
    }
}

package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by Rabin Shrestha on 12/24/2017.
 */
@FacesConverter("myTempratureConverter")
public class CustomTemperatureConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
       if(s==null || s.length()<1)return "Invalid temprature";
       String resultTemp="";
       if(s.charAt(0)=='F')resultTemp="The Temprature is"+s.substring(1)+" Fahrenheit";
       else
       resultTemp="The Temprature is"+s.substring(1)+" Celsius";
        return resultTemp;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if(o==null )return "Invalid Tempreture";
        String s=(String)o;
        String resultTemp="";
        if(s.charAt(0)=='F')resultTemp="The Temprature is"+s.substring(1)+" Fahrenheit";
        else
            resultTemp="The Temprature is"+s.substring(1)+" Celsius";

        return resultTemp;
    }
}

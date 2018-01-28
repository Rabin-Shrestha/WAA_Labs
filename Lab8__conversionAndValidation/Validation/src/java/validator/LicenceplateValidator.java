package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("licenceValidator")
public class LicenceplateValidator implements  Validator{

    public void validate(FacesContext facesContext, UIComponent uIComponent, 
                         Object object) {
        /* Create the correct mask */
                Pattern mask = null;
                mask = Pattern.compile("[A-Z]{2}[-][0-9]{2}[-][A-Z]{2}");
                /* Get the string value of the current field */
                String zipField = (String)object;                           
                /* Check to see if the value is a zip code */
                Matcher matcher = mask.matcher(zipField);               
                if (!matcher.matches()){                 
                 FacesMessage message = new FacesMessage();
                 message.setDetail("Licence plate is not valid");
                 message.setSummary("Licence plate is not valid");
                 message.setSeverity(FacesMessage.SEVERITY_ERROR);
                 throw new ValidatorException(message);
                }

    }
}
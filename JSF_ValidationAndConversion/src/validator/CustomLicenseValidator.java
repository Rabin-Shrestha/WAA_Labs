package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by Rabin Shrestha on 12/24/2017.
 */
@FacesValidator("CustomLicenseValidator")
public class CustomLicenseValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object obj) throws ValidatorException {

        if (obj == null)
            throw new ValidatorException(new FacesMessage("Invalid License number: Empty"));

        String licenseStr = (String) obj;

        if (licenseStr.length() != 8 || !Character.isUpperCase(licenseStr.charAt(0)) || !Character.isUpperCase(licenseStr.charAt(1)) || licenseStr.charAt(2) != '-' || !Character.isDigit(licenseStr.charAt(3)) || !Character.isDigit(licenseStr.charAt(4)) || licenseStr.charAt(5) != '-' || !Character.isUpperCase(licenseStr.charAt(6)) || !Character.isUpperCase(licenseStr.charAt(7))) {
            throw new ValidatorException(new FacesMessage("Invalid License number: License No. has to start with 2 capitals, followed by a dash ‘-’, followed by 2 numbers,\n" +
                    "followed by a dash ‘-’, followed by 2 capitals"));

        }


    }
}

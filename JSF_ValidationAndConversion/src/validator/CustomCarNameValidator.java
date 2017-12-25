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
@FacesValidator("CustomCarNameValidator")
public class CustomCarNameValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object obj) throws ValidatorException {

        if (obj != null) {
            String carName = (String) obj;
            if (!carName.equals("Mercedes") && !carName.equals("BMW")) {
                throw new ValidatorException(new FacesMessage("Invalid Car Brand : Choose either Mercedes OR BMW"));
            }
        } else {
            throw new ValidatorException(new FacesMessage("Invalid Car Brand, Empty a Car Brand"));
        }


    }
}

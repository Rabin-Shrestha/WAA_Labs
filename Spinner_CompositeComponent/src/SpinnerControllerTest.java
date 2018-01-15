import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Rabin Shrestha on 1/7/2018.
 */
@ManagedBean(name = "SpinnerBean")
@SessionScoped
public class SpinnerControllerTest {
    Integer spinnerValue;

    public Integer getSpinnerValue() {
        return spinnerValue;
    }

    public void setSpinnerValue(Integer spinnerValue) {
        this.spinnerValue = spinnerValue;
    }
}

package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Rabin Shrestha on 11/26/2017.
 */
@ManagedBean
@RequestScoped
public class CalculatorBean {
    private Long a;
    private Long b;
    private Long result;

    public CalculatorBean() {
    }

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public void add() {
        this.result = a + b;
    }

    public void subtract() {
        this.result = a - b;
    }

    public void multiply() {
        this.result = a * b;
    }

    public void divide() {
        this.result = a / b;
    }

}

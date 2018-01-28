package managedbeans;



public class Temperature implements java.io.Serializable {
    private String temp;
    private String temptype;

    public Temperature(String temp, String temptype) {
        this.temp = temp;
        this.temptype = temptype;
    }


    public void setTemptype(String temptype) {
        this.temptype = temptype;
    }

    public String getTemptype() {
        return temptype;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTemp() {
        return temp;
    }
    

}
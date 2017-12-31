import java.util.Date;
public class AirlineChoice {


public AirlineChoice(String from, String to, String date, String airline, double price) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.airline = airline;
        this.price = price;
    }
	
    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getPrice() {
        return price;}

    public void setPrice(double price) {
        this.price = price;
    }
    private String to;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    private String airline;
    private double price;

    

}

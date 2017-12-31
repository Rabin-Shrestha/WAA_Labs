package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Rabin Shrestha on 12/3/2017.
 */
@ManagedBean
@SessionScoped
public class TripTracker {
    private String locationFrom;
    private String locationTo;
    private Date departureDate;
    private Date returnDate;
    private boolean isRoundTrip;

   private String[] options;

    public String[] getOptions() {
        return options;
    }
    public String getOptionsString() {
        return Arrays.toString(this.options);
    }
    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    public String getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(String locationTo) {
        this.locationTo = locationTo;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isRoundTrip() {
        return isRoundTrip;
    }

    public void setRoundTrip(boolean roundTrip) {
        isRoundTrip = roundTrip;
    }


public  String gerInformation()
{
    return "tripTrackerInfo.xhtml";
}

}

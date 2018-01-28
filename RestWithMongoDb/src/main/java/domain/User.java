package domain;

/**
 * Created by Rabin Shrestha on 1/28/2018.
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Rabin Shrestha on 8/10/2017.
 */
@Document(collection = "user_collection")
public class User {

    @Id
    private String id;
    @NotNull
    private String userName;
    @NotNull
    private String password;
    private boolean enabled;
    @NotNull
    private String email;
    @NotNull
    private String firstName;
    private String lastName;
    private String address;
    private String zipcode;
    private String phoneNo;
    private String photoUrl;
    private Date lastLogIn;
    private Date createdOn;

    public User() {
    }

    public static void main(String[] args) {
        /*
        Test Date Attribute for MongoDb
        Date createdOn;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date today = Calendar.getInstance().getTime();
        String todayStr= dateFormat .format(today);
        System.out.println("date: "+today);
        System.out.println("date: str"+todayStr);*/
        //sample date : 2017-08-15T16:08:22.019-0500

    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {  return email;   }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getLastLogIn() {
        return lastLogIn;
    }

    public void setLastLogIn(Date lastLogIn) {
        this.lastLogIn = lastLogIn;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
        /*DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String date= dateFormat .format(createdOn);
        Date today = Calendar.getInstance().getTime();
        System.out.println("date:"+date);
        System.out.println("date:"+this.createdOn);
        */
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

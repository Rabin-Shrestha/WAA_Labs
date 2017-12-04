package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Rabin Shrestha on 12/3/2017.
 */
@ManagedBean
@SessionScoped
public class User {
    private String userId;
    private String password;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return "Frank Brown";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String login()
    {

        System.out.println("Log in called");
        System.out.println(this.toString());
       if(null==this.userId || null== this.password || "".equals(this.userId) || "".equals(this.password))
           return "/error/error.xhtml";
        if(this.userId.equals("K101")&& this.password.equals("yoyo"))
            return "/home.xhtml";
        return "/error/error.xhtml";
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

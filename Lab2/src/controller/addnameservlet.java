package controller;

import models.names.Person;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rabin Shrestha on 11/1/2017.
 */
public class addnameservlet extends javax.servlet.http.HttpServlet {
    HttpSession Session;
    HashMap<Integer,Person> personListSession = new HashMap<>();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        System.out.println("Hellooo Dakaaa :D ;D :D ");
        this.Session = request.getSession(false);
        this.personListSession=(HashMap<Integer, Person>)this.Session.getAttribute("personList");
        if(this.personListSession==null)
            this.personListSession = new HashMap<>();
        String fname = request.getParameter("fName");
        String lname = request.getParameter("lName");
        if (fname != null && lname != null)
        {
            this.personListSession.put(this.personListSession.size(),new Person(fname, lname));
            this.Session.setAttribute("personList", this.personListSession);
        }
       // System.out.println(personListSession.toString());
        response.sendRedirect("/");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

}

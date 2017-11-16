package controller;


import models.Person;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Rabin Shrestha on 11/1/2017.
 */
public class addnameservlet extends javax.servlet.http.HttpServlet {
    HttpSession userSession;
    HashMap<Integer, Person> personListSession;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.userSession = request.getSession(true);
        this.personListSession = (HashMap<Integer, Person>) this.userSession.getAttribute("personList");
        if (this.personListSession == null)
            this.personListSession = new HashMap<>();

        String fname = request.getParameter("fName");
        String lname = request.getParameter("lName");
        if (fname != null && lname != null) {
            this.personListSession.put(this.personListSession.size(), new Person(fname, lname));
            this.userSession.setAttribute("personList", this.personListSession);
        }
        request.getRequestDispatcher("/Person/person.jsp").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

}

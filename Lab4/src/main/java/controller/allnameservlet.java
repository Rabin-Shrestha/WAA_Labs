package controller;

import models.Person;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Rabin Shrestha on 11/1/2017.
 */
public class allnameservlet extends javax.servlet.http.HttpServlet {
    HttpSession userSession;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        this.userSession = request.getSession(true);
        if (this.userSession.getAttribute("personList")!=null)
        {
            HashMap<Integer,Person> personListSession = (HashMap<Integer, Person>) this.userSession.getAttribute("personList");
            userSession.setAttribute("personList",personListSession);
            request.getRequestDispatcher("/Person/person.jsp").forward(request,response);
        }
        else
        {
            userSession.setAttribute("personList",null);
            request.getRequestDispatcher("/Person/person.jsp").forward(request,response);
        }




    }

}


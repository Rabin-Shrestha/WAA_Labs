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
public class removenameservlet extends javax.servlet.http.HttpServlet {
    HttpSession Session;
    HashMap<Integer,Person> personListSession = new HashMap<>();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException
    {
        this.Session = request.getSession(false);
        this.personListSession = (HashMap<Integer,Person>) this.Session.getAttribute("personList");
        if (this.personListSession==null) {
            this.personListSession = new HashMap<>();
            this.Session.setAttribute("personList", personListSession);
        }
        if (request.getParameter("removeKey") != null) {
            Integer removeIndex = Integer.parseInt(request.getParameter("removeKey"));

            if(this.personListSession.containsKey(removeIndex))
            {
                // To be safe from invalid key
                System.out.println("This is removed person : " + removeIndex + "====>  " + this.personListSession.get(removeIndex));
                this.personListSession.remove(removeIndex);
                this.Session.setAttribute("personList", this.personListSession);
            }
        }
        response.sendRedirect("/");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

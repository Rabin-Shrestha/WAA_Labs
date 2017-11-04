package controller;

import models.names.Person;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rabin Shrestha on 11/1/2017.
 */
public class allnameservlet extends javax.servlet.http.HttpServlet {
    HttpSession Session;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        this.Session = request.getSession(false);
        StringBuilder homepage=new StringBuilder("");
        System.out.println(" inside all person !! ");
        homepage.append("<html><body>");
        homepage.append("<h3>Lab 2 : Rabin Shrestha</h3>\n" +
                "<br>\n" +
                "<form action=\"/person/\">\n" +
                "    <input type=\"submit\" value=\"List Names\" />\n" +
                "</form>\n" +
                "<br><h2>Addd Person :</h2> <br>\n" +
                "\n" +
                "<form name=\"addNameForm\" method=\"post\" action=\"/person/add\">\n" +
                "    <label>First Name :</label><input type=\"text\" name=\"fName\"/>\n" +
                "    <label>Last Name :</label><input type=\"text\" name=\"lName\"/>\n" +
                "    <input type=\"submit\" value=\"Add Person\">\n" +
                "</form>\n" +
                "\n" +
                "<hr>\n" +
                "\n" +
                "<h2>Delete Person :</h2>\n" +
                "<form name=\"delNameForm\" method=\"post\" action=\"/person/delete\">\n" +
                "    <label>Key : </label> <input type=\"text\" name=\"removeKey\">\n" +
                "    <input type=\"submit\" value=\"Delete\">\n" +
                "</form>\n" +
                "<hr>\n" );


        if (this.Session.getAttribute("personList")!=null)
        {
            HashMap<Integer,Person> personListSession = (HashMap<Integer,Person>) this.Session.getAttribute("personList");
            System.out.println(personListSession.toString());
            homepage.append("<h2>List of Name :</h2>");
            for (Map.Entry<Integer,Person> p: personListSession.entrySet())
            {
                System.out.println(" person is ==> "+p.toString());

                homepage.append("<label> Key : "+p.getKey()+"</person><br>");
                homepage.append("<label> First Name : "+p.getValue().getFirstName()+"</person><br>");
                homepage.append("<label>   Last Name : "+p.getValue().getLastName()+"</person><br><br>");
            }
        }
        else
        {
            homepage.append(" No Person Found");
        }


        homepage.append("</body></html>");
        PrintWriter out=response.getWriter();
        out.write(homepage.toString());

    }

}


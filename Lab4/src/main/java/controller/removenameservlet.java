package controller;
import models.Person;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Rabin Shrestha on 11/1/2017.
 */
public class removenameservlet extends javax.servlet.http.HttpServlet {
    HttpSession userSession;
    HashMap<Integer, Person> personListSession = new HashMap<>();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.userSession = request.getSession(false);
        this.personListSession = (HashMap<Integer, Person>) this.userSession.getAttribute("personList");
        if (this.personListSession == null) {
            this.personListSession = new HashMap<>();
            this.userSession.setAttribute("personList", personListSession);
        }
        if (request.getParameter("removeKey") != null && !request.getParameter("removeKey").equals("")) {
            Integer removeIndex = Integer.parseInt(request.getParameter("removeKey"));
            if (this.personListSession.containsKey(removeIndex)) {
                // To be safe from invalid key
                System.out.println("This is removed person : " + removeIndex + "====>  " + this.personListSession.get(removeIndex));
                this.personListSession.remove(removeIndex);
                this.userSession.setAttribute("personList", this.personListSession);
            }
            else {
                request.setAttribute("errorMessage"," Invalid key Submitted");
            }
        }else {
            request.setAttribute("errorMessage"," Invalid key Submitted");
        }

        request.getRequestDispatcher("/Person/person.jsp").forward(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

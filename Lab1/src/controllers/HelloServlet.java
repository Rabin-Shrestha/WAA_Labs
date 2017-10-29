package controllers;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Rabin Shrestha on 10/28/2017.
 */
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<Html>");
        out.println("<ody>");
        out.println("Hello World, This is from HelloServlet Controller");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}

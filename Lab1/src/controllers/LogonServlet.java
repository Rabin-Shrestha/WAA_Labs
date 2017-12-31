package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Rabin Shrestha on 10/28/2017.
 */
@WebServlet(name = "LogonServlet")
public class LogonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname=request.getParameter("username");
        String upass=request.getParameter("password");
        if(!uname.equals("user") || !upass.equals("pass"))
        {
            System.out.println();
            PrintWriter out = response.getWriter();
            out.print("<html>");
            out.println("<body>");
            out.println("Wrong Userid or Password ! please Write again\"");
            out.println("<form method=post action=/Login>");
            out.println("Username=<input type=text name=username> <br>");
            out.println("Password=<input type=text name=password>");
            out.println("<input type=submit value='Logon'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
        else
        {
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("Welcome User");
            out.println("</body>");
            out.println("</html>");
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=post action=/Login>");
        out.println("Username=<input type=text name=username> <br>");
        out.println("Password=<input type=text name=password>");
        out.println("<input type=submit value='Logon'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}

package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Stack;

/**
 * Created by Rabin Shrestha on 12/8/2017.
 */
@WebServlet(name = "MyStackServlet")
public class MyStackServlet extends HttpServlet {
    Stack<String> myNameStack=new Stack<>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession s= request.getSession(true);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);

    }
}

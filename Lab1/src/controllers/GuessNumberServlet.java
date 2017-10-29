package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by Rabin Shrestha on 10/28/2017.
 */
@WebServlet(name = "GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String guessedValue = request.getParameter("guessedValue");
        String randomValue = request.getParameter("randomval");
        StringBuilder responseString = new StringBuilder("");
        if (guessedValue == null || guessedValue == "") {
            // not valid input
            responseString.append("Invalid value entered ");
        } else {
            // check Input value from user
            Integer guessed = Integer.parseInt(guessedValue);
            Integer rand = Integer.parseInt(randomValue);

            if (rand.equals(guessed)) {
                //matched
                responseString.append("Correct, Congratulation, your guess matched ");

            } else if (guessed < rand) {
                // to small
                responseString.append("Too low, Try again ");

            } else {
                // large
                responseString.append("Too high, Try again ");
            }
        }

        // #### writing response body  ####

        Random rand = new Random();
        Integer randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println(responseString);
        out.println("<form method=post action=/GuessNumber>");
        out.println("<input type=hidden name=randomval value=" + randomNumber + "> <br>");
        out.println("Enter your Guess (Between 1 to 10 )<br><br><input type=Number name=guessedValue>");
        out.println("<input type=submit value='Send'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Random rand = new Random();
        Integer randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=post action=/GuessNumber>");
        out.println("<input type=hidden name=randomval value=" + randomNumber + "> <br>");
        out.println("Enter your Guess (Between 1 to 10 )<br><br><input type=Number name=guessedValue>");
        out.println("<input type=submit value='Send'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}

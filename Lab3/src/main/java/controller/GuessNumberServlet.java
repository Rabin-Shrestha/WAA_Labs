package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Rabin Shrestha on 10/28/2017.
 */
@WebServlet(name = "GuessNumberServlet", urlPatterns = "/GuessNumber")
public class GuessNumberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String guessedValue = request.getParameter("guessedValue");
        String randomValue = request.getParameter("randomval");

        System.out.println("Guessed value : " + guessedValue);
        System.out.println(" Random Value :" + randomValue);

        String errorMsg = "";
        String reslutMsg = "";
        if (guessedValue == null || guessedValue.equals("")) {
            // not valid input
            errorMsg = "Invalid value entered ";
        } else {
            // check Input value from users
            Integer guessed = Integer.parseInt(guessedValue);

            Integer rand = Integer.parseInt(randomValue);
            if (rand.equals(guessed)) {
                //matched
                reslutMsg = "Correct, Congratulation, your guess matched ";
            } else if (guessed < rand) {
                // to small
                errorMsg = "Too low, Try again ";
            } else {
                // large
                errorMsg = "Too high, Try again ";
            }
        }

        // #### writing response body  ####
        request.setAttribute("Error", errorMsg);
        request.setAttribute("Result", reslutMsg);

        Random rand = new Random();
        Integer randomNumber = rand.nextInt(10);
        request.setAttribute("randomValue", randomNumber);
        request.getRequestDispatcher("/guessNumber.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random rand = new Random();
        Integer randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        request.setAttribute("randomValue", randomNumber);
        request.getRequestDispatcher("/guessNumber.jsp").forward(request, response);
    }
}

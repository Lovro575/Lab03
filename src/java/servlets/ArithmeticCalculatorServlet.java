package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/calc"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstnumber = request.getParameter("firstNumber");
        String secondnumber = request.getParameter("secondNumber");
        String noCalculation = "---";
        
         //error cheching
       if(firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")) {
            request.setAttribute("errorMessage", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        
        
        int firstInt = Integer.parseInt(firstnumber);
        int secondInt = Integer.parseInt(secondnumber);
        int result;

        request.setAttribute("firstNum", firstnumber);
        request.setAttribute("secondNum", secondnumber);
        
        String plus = request.getParameter("plus");
        String minus = request.getParameter("minus");
        String multiply = request.getParameter("multiplication");
        String modulus = request.getParameter("modulus");
        
       
       
        if (plus != null) {
            result = firstInt + secondInt;
            request.setAttribute("result", result);   
        } 
        else if (minus != null) {
            result = firstInt - secondInt;
            request.setAttribute("result", result);
        } 
        else if (multiply != null) {
            result = firstInt * secondInt;
            request.setAttribute("result", result);
        } 
        else if (modulus != null) {
            result = firstInt % secondInt;
            request.setAttribute("result", result);
        } 
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       
    }
}

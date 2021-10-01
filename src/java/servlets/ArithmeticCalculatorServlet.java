/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
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
        
         //error cheching not working
        if(firstnumber == null || firstnumber.equals("") || secondnumber == null || secondnumber.equals("")) {
            request.setAttribute("errorMessage", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        
        String noCalculation = "---";
        
        int firstInt = Integer.parseInt(firstnumber);
        int secondInt = Integer.parseInt(secondnumber);
        int result = 0;
        
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
            
        } 
        
        request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        
        

    }


}

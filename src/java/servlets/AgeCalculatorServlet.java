package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age_input");
        int ageNumber = Integer.parseInt(age);
        request.setAttribute("ageAttribute", age);
        
          //error cheching
        if(age == null || age.equals("") || ageNumber < 1) {
            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
        }
        

        
      
        if(ageNumber > 0) {
            int nextBirthday = ageNumber + 1;
            request.setAttribute("result", nextBirthday);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        } 
        return;
        
    }
}

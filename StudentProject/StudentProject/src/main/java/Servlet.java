

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String username = request.getParameter("username");
		    String password = request.getParameter("password");

		
		    if (username != null && password != null) {
		        // Authentication successful
		    	HttpSession session = request.getSession();
		        request.getSession().setAttribute("username", username);
			    request.getSession().setAttribute("password", password);
			    
		        response.sendRedirect("StudentAdmission.jsp"); 
		    } else {
		        // Authentication failed
		        response.sendRedirect("ForgotPassword.html"); 
		 }
	}

}

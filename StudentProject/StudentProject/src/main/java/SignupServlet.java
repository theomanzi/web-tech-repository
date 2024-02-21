

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String email = request.getParameter("email");
		    String password = request.getParameter("password");

		   
		    if (email != null && password != null) {
		        response.sendRedirect("Login.jsp"); 
		    } else {
		        response.sendRedirect("Signup.html"); 
		 }
	}

}

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class MyFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
String pass = req.getParameter("password");		
String username = req.getParameter("username");

if( "fadi".equals(username)&& "fadi".equals(pass) )
{
	chain.doFilter(req, res);
	}else
	{
		  PrintWriter out=res.getWriter(); 
          req.setAttribute("errorMessage", "Incorrect username and password");
	       RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
           rd.forward(req, res);
	}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}

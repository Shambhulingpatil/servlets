package servlet_calculator;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Division1
 */
public class Division1 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		
		res.getWriter().print("<h1>The Division of "+n1+" and "+n2+" is "+(n1/n2)+"</h1>");
		
	}

}

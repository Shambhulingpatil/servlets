package servlet_calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sub")
public class Subtraction extends GenericServlet {//abstract class

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		
		res.getWriter().print("<h1>The subtraction of "+n1+" and "+n2+" is "+(n1-n2)+"</h1>");
		
	}

}

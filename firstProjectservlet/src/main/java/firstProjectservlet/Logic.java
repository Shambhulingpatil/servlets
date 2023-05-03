package firstProjectservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Hello")
public class Logic implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fn=req.getParameter("fn");
		String ln=req.getParameter("ln");
		//System.out.println("Hello "+fn+" "+ln); // PRINT IN CONSOLE
		
		//res.getWriter().print("Good Evening "+fn+" "+ln);//PRINT ON DISPLAY //PrintWriter class
		System.out.println();
		res.getWriter().print("<h1 style='color:red'> Good Morning "+fn+" "+ln+"</h1>");
	}
	 

}

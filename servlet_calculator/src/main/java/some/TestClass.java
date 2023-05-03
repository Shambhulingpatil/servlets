package some;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class TestClass extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		res.getWriter().print("<h1> This is testclass servlet </h1>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("demo");
		dispatcher.include(req, res);
		
		
		//req.getRequestDispatcher("demo").include(req, res);//travel from one servlet to another servlet directly
		req.getRequestDispatcher("index.html").include(req, res);
	}

}

package servlet_lifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ello")
public class Hello implements Servlet {
	
	static {
		System.out.println("First static block is invoked");
	}
	
	public Hello() {
		// TODO Auto-generated constructor stub
		System.out.println("2nd constructor is invoked and object is created");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy methd is called");
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
		System.out.println("Hello class init method is invoked");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" hello class Sevice method is invoked");
	}

}

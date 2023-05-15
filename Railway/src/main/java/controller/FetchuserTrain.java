package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Traindao;
import dto.Train;

@WebServlet("/usertraininfo")
public class FetchuserTrain extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Traindao dao=new Traindao(); 
		List<Train> list=dao.fetchAll();
		
		if(list.isEmpty()) {
			res.getWriter().print("<h1 style='color:red'> No Railway information");
			req.getRequestDispatcher("UserHome.html").include(req, res);
		}
		else {
			req.setAttribute("list", list);
			req.getRequestDispatcher("userfetchrailway.jsp").forward(req, res);
		}
	}

}

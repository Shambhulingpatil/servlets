package controller;

import java.io.IOException;
import dto.Train;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTrain extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int trainnumber=Integer.parseInt(req.getParameter("tnumber"));
	String trainame=req.getParameter("tname");
	int trainseat=Integer.parseInt(req.getParameter("tseat"));
	String station=req.getParameter("tstation");
	String[] trainstations=station.split(",");
	String price=req.getParameter("tprice");
	
	String[] trainprice=price.split(",");
	
	String time=req.getParameter("ttime");
	String[] traintime=time.split(",");
	String days=req.getParameter("tdays");
	String[] traindays=days.split(",");
	Train train=new Train();
	
	train.setNumber(trainnumber);
	train.setName(trainame);
	train.setSeat(trainseat);
	train.setDays(traindays);
	train.setPrice(trainprice);
	train.setStations(trainstations);
	train.setTime(traintime);
}
}

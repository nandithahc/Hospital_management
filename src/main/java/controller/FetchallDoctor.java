package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDao;
import dto.Doctor;
import dto.Staff;

@WebServlet("/fetchalldoctor")
public class FetchallDoctor extends HttpServlet {

	
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	MyDao dao=new MyDao();
	List<Doctor> list=dao.fetchAllDoctor(); 
	if(list.isEmpty())
	{
		resp.getWriter().print("<h1 style='color:aqua'>No Doctor has signed up yet</h1>");
		req.getRequestDispatcher("AdminHome.html").include(req, resp);
	}
	else{
		req.setAttribute("list", list);
		req.getRequestDispatcher("ApproveDoctor.jsp").forward(req, resp);
	}
	
}
}

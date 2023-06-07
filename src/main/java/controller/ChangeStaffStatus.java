package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDao;
import dto.Staff;

@WebServlet("/changestaffstatus")
public class ChangeStaffStatus  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		MyDao dao=new MyDao();
		Staff staff=dao.fetchStaff(id);
		if(staff.isStatus())
		{
			staff.setStatus(false);
		}
		else
		{
			staff.setStatus(true);
		}
		dao.updateStaff(staff);
		resp.getWriter().print("<h1 style='color:red'>Updated succesfully</h1>");
		req.setAttribute("list",dao.fetchAllstaff());
		req.getRequestDispatcher("ApproveStaff.jsp").include(req, resp);
	}
}

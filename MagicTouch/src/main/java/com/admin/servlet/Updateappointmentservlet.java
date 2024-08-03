package com.admin.servlet;

import java.io.IOException;

import com.DAO.AppDAOimpl;
import com.DAO.UserDAOimpl;
import com.DB.DBconnect;
import com.entity.User;
import com.entity.appointment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/editapp")
public class Updateappointmentservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			  int id=Integer.parseInt(req.getParameter("id"));
			  
			  String name=req.getParameter("name");
				String mobno=req.getParameter("mobno");
				String email=req.getParameter("email");
				String idServices=req.getParameter("idServices");
				String address=req.getParameter("address");
				String date =req.getParameter("date");
				String time=req.getParameter("time");
				String status=req.getParameter("status");
				
				appointment a=new appointment();
				a.setIdappointment(id);
				a.setName(name);
				a.setMobno(mobno);
				a.setEmail(email);
				a.setIdServices(idServices);
				a.setAddress(address);
				a.setDate(date);
				a.setTime(time);
				a.setStatus(status);
				
				AppDAOimpl dao =new AppDAOimpl(DBconnect.getConn());
				boolean f=dao.Updateapp(a);
				HttpSession session =req.getSession();
				if(f)
				{
					session.setAttribute("succmsg", "appointment update successfuly");
					resp.sendRedirect("Admin/appoint.jsp");
				}
				else {
					session.setAttribute("filedmsg", "appointment update unsuccessfuly");
					resp.sendRedirect("Admin/appoint.jsp");
				}
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

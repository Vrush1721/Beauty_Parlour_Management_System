package com.admin.servlet;

import java.io.IOException;

import com.DAO.AppDAOimpl;

import com.DB.DBconnect;

import com.entity.appointment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/addappointmentservlet")
public class addappointmentservlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			int uid =Integer.parseInt(req.getParameter("uid"));
			String name=req.getParameter("name");
			String mobno=req.getParameter("mobno");
			String email =req.getParameter("email");
		    String idServices=req.getParameter("idServices");
			String address=req.getParameter("address");
			String date =req.getParameter("date");
			String time =req.getParameter("time");
			String status=req.getParameter("status");
			appointment a=new appointment();
			a.setName(name);
			a.setMobno(mobno);
			a.setEmail(email);
			a.setIdServices(idServices);
			a.setAddress(address);
			a.setDate(date);
			a.setTime(time);
			a.setStatus(status);
			a.setUid(uid);
AppDAOimpl dao=new AppDAOimpl(DBconnect.getConn());
			HttpSession session= req.getSession();
			boolean f1=dao.addAppoint(a);
			if(f1) {
			
				session.setAttribute("asuccmsg", "Appointment request successfully");
				resp.sendRedirect("uappoint.jsp");

			}
			else {
				session.setAttribute("afiledmsg", "Somthing wrong with server");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
	}

}
}
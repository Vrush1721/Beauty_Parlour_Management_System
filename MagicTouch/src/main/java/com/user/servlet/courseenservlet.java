package com.user.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.DAO.AppDAOimpl;
import com.DAO.UserDAOimpl;
import com.DAO.UsercourseDAOimpl;
import com.DB.DBconnect;
import com.entity.Enrolluser;
import com.entity.User;
import com.entity.appointment;

@WebServlet("/Addenrolldata")
public class courseenservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
			
			int uid =Integer.parseInt(req.getParameter("uid"));
			String cname=req.getParameter("cname");
			String ctype=req.getParameter("ctype");
			String cprice=req.getParameter("cprice");
			String cdetails=req.getParameter("cdetails");
			
			Enrolluser e1=new Enrolluser();
			e1.setCname(cname);
			e1.setCtype(ctype);
			e1.setCprice(cprice);
			e1.setCdetails(cdetails);
			
			e1.setUid(uid);
			UsercourseDAOimpl dao=new UsercourseDAOimpl(DBconnect.getConn());
			HttpSession session= req.getSession();
			boolean f1=dao.addEnrolluser(e1);
			if(f1) {
			
				session.setAttribute("asuccmsg", "Course request successfully");
				resp.sendRedirect("enroll.jsp");

			}
			else {
				session.setAttribute("afiledmsg", "Somthing wrong with server");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
	}

	}
	
	

}

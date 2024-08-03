package com.admin.servlet;

import java.io.IOException;

import com.DAO.CourseDAOimpl;
import com.DB.DBconnect;
import com.entity.Courses;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ceditcourse")
public class Courseupdate  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			  int id=Integer.parseInt(req.getParameter("id"));
			  String cname=req.getParameter("cname");
				String ctype=req.getParameter("ctype");
				String cprice=req.getParameter("cprice");
				String photo =req.getParameter("photo");
				String cdetails=req.getParameter("cdetails");
				
				Courses c=new Courses();
				c.setIdcourse(id);
				c.setCname(cname);
				c.setCtype(ctype);
				c.setCprice(cprice);
				c.setPhoto(photo);
				c.setCdetails(cdetails);
				
				CourseDAOimpl dao=new CourseDAOimpl(DBconnect.getConn());
				
				boolean f=dao.Updatecourse(c);
				HttpSession session =req.getSession();
				if(f)
				{
					session.setAttribute("cosuccmsg", "Course update successfuly");
					resp.sendRedirect("Admin/Allcourse.jsp");
				}
				else {
					session.setAttribute("cofiledmsg", "appointment update unsuccessfuly");
					resp.sendRedirect("Admin/Allcourse.jsp");
				}
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	

}

package com.admin.servlet;

import java.io.IOException;

import com.DAO.AppDAOimpl;
import com.DAO.CourseDAOimpl;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delcourse")
public class DelCourse extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int cid=Integer.parseInt(req.getParameter("id"));
			CourseDAOimpl dao=new CourseDAOimpl(DBconnect.getConn());
			boolean f=dao.Delcourse(cid);
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("ccsuccmsg", "Course delete successfuly");
				resp.sendRedirect("Admin/Allcourse.jsp");
			}
			else {
				session.setAttribute("ccfiledmsg", "Something wents wrong with server");
				resp.sendRedirect("Admin/Allcourse.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

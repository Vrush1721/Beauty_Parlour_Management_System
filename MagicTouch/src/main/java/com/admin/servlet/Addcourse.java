package com.admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

import com.DAO.CourseDAOimpl;
import com.DB.DBconnect;
import com.entity.Courses;

@WebServlet("/addcourse")
@MultipartConfig
public class Addcourse extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String cname = req.getParameter("cname");
			String ctype = req.getParameter("ctype");
			String cprice = req.getParameter("cprice");
			Part part = req.getPart("photo");
			String filename = part.getSubmittedFileName();
			String cdetails = req.getParameter("cdetails");

			Courses c = new Courses(cname, ctype, cprice, filename, cdetails);
			CourseDAOimpl dao = new CourseDAOimpl(DBconnect.getConn());

			HttpSession session = req.getSession();
			boolean f1 = dao.addcourse(c);
			if (f1) {

				String path = getServletContext().getRealPath("") + "images";
				// System.out.println(path);
				File f = new File(path);
				part.write(path + File.separator + filename);

				session.setAttribute("caasuccess", "course add sucessfully");
				resp.sendRedirect("Admin/Allcourse.jsp");
			} else {
				session.setAttribute("caafialmsg", "course add Unsucessfully");
				resp.sendRedirect("Admin/course.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.admin.servlet;

import java.io.IOException;

import com.DAO.AppDAOimpl;
import com.DAO.ServiceDAoimpl;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Deleteapp")
public class Deleteappservlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int aid=Integer.parseInt(req.getParameter("id"));
			AppDAOimpl dao=new AppDAOimpl(DBconnect.getConn());
			boolean f=dao.Deleteapp(aid);
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("succmsg", "Appointment delete successfuly");
				resp.sendRedirect("Admin/appoint.jsp");
			}
			else {
				session.setAttribute("filedmsg", "Something wents wrong with server");
				resp.sendRedirect("Admin/appoint.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

package com.admin.servlet;

import java.io.IOException;

import com.DAO.FeedDAOimpl;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delfeed")
public class Delfeedservlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int fid=Integer.parseInt(req.getParameter("id"));
			FeedDAOimpl dao=new FeedDAOimpl(DBconnect.getConn());
			boolean f=dao.Deletefeed(fid);
			HttpSession session=req.getSession();
			if(f)
			{
				session.setAttribute("fisuccmsg", "feedback delete successfuly");
				resp.sendRedirect("Admin/contacts.jsp");
			}
			else {
				session.setAttribute("fifiledmsg", "Something wents wrong with server");
				resp.sendRedirect("Admin/contacts.jsp");
			}
			
			
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

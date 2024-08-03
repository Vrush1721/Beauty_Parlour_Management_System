package com.user.servlet;

import java.io.IOException;

import com.DAO.AppDAOimpl;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Cancel")
public class Cancel extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int aid=Integer.parseInt(req.getParameter("id"));
			AppDAOimpl dao=new AppDAOimpl(DBconnect.getConn());
			boolean f=dao.cancelapp(aid);
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("succmsg", "Appointment delete successfuly");
				resp.sendRedirect("uappoint.jsp");
			}
			else {
				session.setAttribute("filedmsg", "Something wents wrong with server");
				resp.sendRedirect("uappoint.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

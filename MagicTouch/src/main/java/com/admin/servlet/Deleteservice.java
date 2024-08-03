package com.admin.servlet;

import java.io.IOException;

import com.DAO.ServiceDAoimpl;
import com.DAO.UserDAOimpl;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Deleteservice")
public class Deleteservice extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int sid=Integer.parseInt(req.getParameter("id"));
			ServiceDAoimpl dao=new ServiceDAoimpl(DBconnect.getConn());
			boolean f=dao.Deleteservice(sid);
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("succmsg", "Service delete successfuly");
				resp.sendRedirect("Admin/service.jsp");
			}
			else {
				session.setAttribute("filedmsg", "Something wents wrong with server");
				resp.sendRedirect("Admin/service.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

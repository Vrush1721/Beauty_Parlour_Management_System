package com.admin.servlet;

import java.io.IOException;

import com.DAO.UserDAOimpl;
import com.DB.DBconnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/delcustservlet")
public class delcustservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int id=Integer.parseInt(req.getParameter("id"));
			UserDAOimpl dao=new UserDAOimpl(DBconnect.getConn());
			boolean f=dao.Deleteuser(id);
			
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("succmsg", "Customer delete successfuly");
				resp.sendRedirect("Admin/customer.jsp");
			}
			else {
				session.setAttribute("filedmsg", "Something wents wrong with server");
				resp.sendRedirect("Admin/customer.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}

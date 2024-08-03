package com.admin.servlet;

import java.io.IOException;

import com.DAO.ServiceDAoimpl;
import com.DAO.UserDAOimpl;
import com.DB.DBconnect;
import com.entity.Service;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/upservi")
public class Updateser extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			  int id=Integer.parseInt(req.getParameter("id"));
			  String sname=req.getParameter("sname");
			 
				String cost=req.getParameter("cost");
				Service s=new Service();
				s.setIdServices(id);
				s.setSname(sname);
				s.setCost(cost);
				ServiceDAoimpl dao=new ServiceDAoimpl(DBconnect.getConn());
				boolean f=dao.Updateservice(s);
				HttpSession session =req.getSession();
				if(f)
				{
					session.setAttribute("succmsg", "service update successfuly");
					resp.sendRedirect("Admin/service.jsp");
				}
				else {
					session.setAttribute("filedmsg", "Something wents wrong with server");
					resp.sendRedirect("Admin/service.jsp");
				}
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

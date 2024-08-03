package com.admin.servlet;

import java.io.IOException;

import com.DAO.ServiceDAoimpl;
import com.DB.DBconnect;
import com.entity.Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/addserviceservlet")
public class addserviceservlet extends HttpServlet {

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String sname =req.getParameter("sname");
			String cost =req.getParameter("cost");
			
			Service s=new Service();
			s.setSname(sname);
			s.setCost(cost);
			
			ServiceDAoimpl dao=new ServiceDAoimpl(DBconnect.getConn());
			HttpSession session= req.getSession();
			boolean f=dao.addservicesdb(s);
			if(f) {
				session.setAttribute("succmsg", "add service successfully");
				resp.sendRedirect("Admin/service.jsp");

			}
			else {
				session.setAttribute("filedmsg", "add service unsuccessfuly");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.DAO.UserDAOimpl;
import com.DB.DBconnect;
import com.entity.User;
import com.mysql.cj.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {

	public loginservlet() {
		super();
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		System.out.print(email+" "+password);
		UserDAOimpl dao=new UserDAOimpl(DBconnect.getConn());
		HttpSession session=req.getSession();
		User user=dao.login(email, password);
		if("admin@gmail.com".equals(email) &&"Admin@123".equals(password) ) {
			User us =new User();
			us.setFname("Admin");
			session.setAttribute("userobj", us);
			resp.sendRedirect("Admin/home.jsp");
		}else if(user!=null) {
			session.setAttribute("userobj1", user);
			resp.sendRedirect("index.jsp");
		}
		else {
			session.setAttribute("lFailmsg", "email and password invalid");
			resp.sendRedirect("login.jsp");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

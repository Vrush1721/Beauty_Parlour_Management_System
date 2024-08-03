package com.user.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class Logoutservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			HttpSession session=req.getSession();
			session.removeAttribute("userobj");
			HttpSession session2=req.getSession();
			session.setAttribute("sucess","logout sucessfully");
			resp.sendRedirect("login.jsp");
			
			HttpSession session3 =req.getSession();
			session3.removeAttribute("userobj1");
			session3.setAttribute("sucess","logout sucessfully");
			resp.sendRedirect("login.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
}

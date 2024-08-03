package com.user.servlet;

import java.io.IOException;

import org.apache.catalina.tribes.group.Response;

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

@WebServlet("/register")
public class Regservlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String fname=req.getParameter("fname");
			String mobno=req.getParameter("mobno");
			String email=req.getParameter("email");
			String address=req.getParameter("address");
			String password=req.getParameter("password");
			
		  //System.out.println(name+" "+mobno+" "+email+" "+address+" "+password);
			
			User us=new User();
			us.setFname(fname);
			us.setMobno(mobno);
			us.setEmail(email);
			us.setAddress(address);
			us.setPassword(password);
			
		   UserDAOimpl dao =new UserDAOimpl(DBconnect.getConn());
		   HttpSession session=req.getSession();
		   boolean f=dao.userRegister(us);
		   if(f) {
			   System.out.println("user Registration Sucessfully");
			   session.setAttribute("rsuccMsg","Registration Sucessfully");
			    resp.sendRedirect("login.jsp");
		   }
		   else {
			   System.out.println("Something wents wrong");
		   }
		} catch (Exception e) {
			e.printStackTrace();		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

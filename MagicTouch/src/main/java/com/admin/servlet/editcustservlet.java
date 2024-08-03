package com.admin.servlet;

import java.io.IOException;

import org.apache.catalina.tribes.group.Response;

import com.DAO.UserDAOimpl;
import com.DB.DBconnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/editcust")
public class editcustservlet extends HttpServlet {
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  try {
		  int id=Integer.parseInt(req.getParameter("id"));
		  String fname=req.getParameter("fname");
			String mobno=req.getParameter("mobno");
			String email=req.getParameter("email");
			String address=req.getParameter("address");
			
			User u= new User();
			u.setIdUser(id);
			u.setFname(fname);
			u.setMobno(mobno);
			u.setEmail(email);
			u.setAddress(address);
			UserDAOimpl dao =new UserDAOimpl(DBconnect.getConn());
			boolean f=dao.Updateuser(u);
			HttpSession session =req.getSession();
			if(f)
			{
				session.setAttribute("ecsuccmsg", "Customer update successfuly");
				resp.sendRedirect("Admin/customer.jsp");
			}
			else {
				session.setAttribute("ecfiledmsg", "Customer update unsuccessfuly");
				resp.sendRedirect("Admin/customer.jsp");
			}
		  
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

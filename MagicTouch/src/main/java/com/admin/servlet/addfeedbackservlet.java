package com.admin.servlet;

import java.io.IOException;

import com.DAO.FeedDAOimpl;
import com.DAO.ServiceDAoimpl;
import com.DB.DBconnect;
import com.entity.Feedback;
import com.entity.Service;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/addfeedbackservlet")
public class addfeedbackservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
			
			String name=req.getParameter("name");
			String mobno=req.getParameter("mobno");
			String email =req.getParameter("email");
			String address=req.getParameter("address");
			String messege=req.getParameter("messege");
			Feedback f=new Feedback();
			f.setName(name);
			f.setMobno(mobno);
			f.setEmail(email);
			f.setAddress(address);
			f.setMessege(messege);
			FeedDAOimpl dao=new FeedDAOimpl(DBconnect.getConn());
			HttpSession session= req.getSession();
			boolean f1=dao.addfeedback(f);
			if(f1) {
				session.setAttribute("csuccmsg", "Feedback send successfully");
				resp.sendRedirect("index.jsp");

			}
			else {
				session.setAttribute("cfiledmsg", "feedback send unsuccessfuly");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

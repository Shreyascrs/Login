package com.bridgeit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;




import com.bridgeit.Dao.DaoImpl;
import com.bridgeit.Dao.IDao;
import com.bridgeit.pojo.User;
@SuppressWarnings("serial")
@WebServlet("/register")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setName(req.getParameter("name"));
		user.setUsername(req.getParameter("username"));
		user.setDob(req.getParameter("dob"));
		user.setPhonenumber(req.getParameter("phonenumber"));
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		IDao dao= DaoImpl.getInstanc();
 		System.err.println(user.toString());
 		
 		
		if(req.getParameter("conformpassword").equals(user.getPassword()))
		{
		
			System.out.println("registeration sucessfull");
			try {
				dao.userRegister(user);
				req.getRequestDispatcher("Login.jsp").forward(req, resp);
			} catch (HeuristicMixedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
			System.out.println("registration failed");
		}

		System.out.println();
	}

}

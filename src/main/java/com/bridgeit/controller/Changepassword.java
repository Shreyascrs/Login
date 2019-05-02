package com.bridgeit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.bridgeit.Dao.DaoImpl;
import com.bridgeit.Dao.IDao;


@SuppressWarnings("serial")
@WebServlet("/password")
public class Changepassword extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String confirmpassword=req.getParameter("confirmpassword");
		IDao idao=DaoImpl.getInstanc();
		if(password.equals(confirmpassword))
		{
			idao.changepassword(username, password);
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		}else
		{
			System.out.println("password and confirmpassword must be same");
		}
		
	}

}

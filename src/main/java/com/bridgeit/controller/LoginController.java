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
@WebServlet("/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		IDao dao=DaoImpl.getInstanc();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		boolean check;
//		System.out.println("user name is :"+username);
//		System.out.println("the password is :"+password);
		check=dao.loginUser(username, password);
		if(check==true)
		{
			System.out.println("login successfull");
			req.getRequestDispatcher("Welcome.jsp").forward(req, resp);
		}
		else
		{
			System.out.println("password error");
		}
	}

}

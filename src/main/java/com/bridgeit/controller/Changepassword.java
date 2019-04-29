package com.bridgeit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/password")
public class Changepassword extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String confirmpassword=req.getParameter("confirmpassword");
		System.out.println("username  "+username);
		System.out.println("password  "+password);
		System.out.println("confirm password  "+confirmpassword);
		
	}

}

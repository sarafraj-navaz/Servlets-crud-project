package com.jsp.servlet_demo_project0.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet_demo_project0.dto.User;
import com.jsp.servlet_demo_project0.service.UserService;

@WebServlet(value = "/insert")
public class InsertController implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		UserService service=new UserService();
		
		PrintWriter printWriter=res.getWriter();
		
		String name=req.getParameter("Username");
		String email=req.getParameter("Useremail");
		Long number=Long.parseLong(req.getParameter("Number"));
		String gender=req.getParameter("MyGender");
		String address=req.getParameter("MyAddress");
		
		User user=new User(name,email,number,gender,address);
		
		service.saveUserService(user);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("insert.jsp");
		dispatcher.include(req, res);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

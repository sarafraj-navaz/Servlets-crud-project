package com.jsp.servlet_demo_project0.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.servlet_demo_project0.service.UserService;


@WebServlet(value = "/delete")
public class DeleteUserController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id =Integer.parseInt(req.getParameter("id"));
		
		UserService service = new UserService();
		service.deleteUserService(id);
		
//		 RequestDispatcher dispatcher= req.getRequestDispatcher("display.jsp");
//		 
//		 dispatcher.forward(req, res);
		req.getRequestDispatcher("display.jsp").forward(req, res);
		
	}
	
	
	

}

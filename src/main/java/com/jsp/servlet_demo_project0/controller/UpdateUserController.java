package com.jsp.servlet_demo_project0.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet_demo_project0.dto.User;
import com.jsp.servlet_demo_project0.service.UserService;

@WebServlet(value = "/editActionPage")
public class UpdateUserController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Long phone = Long.parseLong(req.getParameter("phone"));
		String gender = req.getParameter("gender");
		String address = req.getParameter("address");
		
		User user = new User(id, name, email, phone, gender, address);
		new UserService().updateUserService(user);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
		dispatcher.include(req, resp);
    }

}

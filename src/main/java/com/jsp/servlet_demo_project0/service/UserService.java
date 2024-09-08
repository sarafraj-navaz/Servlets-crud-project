package com.jsp.servlet_demo_project0.service;

import java.util.List;

import com.jsp.servlet_demo_project0.dao.UserDao;
import com.jsp.servlet_demo_project0.dto.User;

public class UserService {

	UserDao userDao = new UserDao();

	/*
	 * 
	 * insert service
	 */

	public User saveUserService(User user) {

		return userDao.saveUserDao(user);
	}
	
	/**
	 * Delete method
	 */
	
	public void deleteUserService(int userId) {
		
		userDao.deleteUserDao(userId);
	}

	//update-method
	public int updateUserService(User user) {
		
		return userDao.updateUserDao(user);
	}
}

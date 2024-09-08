package com.jsp.servlet_demo_project0.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserConnection {
	
	public static Connection getUserConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url =  "jdbc:mysql://localhost:3306/servlets-demo-project0";
			String user = "root";
			String  pass ="0786";
			
		return	DriverManager.getConnection(url, user, pass); 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}

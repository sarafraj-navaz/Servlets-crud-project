package com.jsp.servlet_demo_project0.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_demo_project0.connection.UserConnection;
import com.jsp.servlet_demo_project0.dto.User;

public class UserDao {
	
	
	Connection  con=UserConnection.getUserConnection();
	public User saveUserDao(User user) {
		 
		/* String insertQuery="insert into user values(?,?,?,?,?)"; */
		/*ther ways*/
		
		
		String  insertQuery="insert into user(username,useremail,userphone,usergender,useraddress)values(?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement=con.prepareStatement(insertQuery);
			
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserEmail());
			preparedStatement.setLong(3, user.getUserPhone());
			preparedStatement.setString(4, user.getUserGender());
			preparedStatement.setString(5, user.getUserAddress());
			
			preparedStatement.execute();
			  
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	/*
	 * in the method we are making display method type of generic 
	 * 
	 */
	public List<User> displayAll(){
		
		
	
		String displayQuery = "select *  from user";
		
		try {
			PreparedStatement preparedStatement=con.prepareStatement(displayQuery);
			ResultSet rs=preparedStatement.executeQuery();
			
			List<User> users=new ArrayList<User>();
			
			while(rs.next()) {
				
				User user=new User();
				
				int id=rs.getInt("userid");
				String name=rs.getString("username");
				String  email=rs.getString("useremail");
				Long phone=rs.getLong("userphone");
				String gender=rs.getString("usergender");
				String  address  =  rs.getString("useraddress");
				
				user.setUserId(id);
				user.setUserName(name);
				user.setUserEmail(email);
				user.setUserPhone(phone);
				user.setUserGender(gender);
				user.setUserAddress(address);
				
				users.add(user);
			}
			
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * Delete method
	 */
	
	public void deleteUserDao(int userId) {
		
		String deleteQuery ="delete from user where userid =?";
		try {
			  PreparedStatement preparedStatement = con.prepareStatement(deleteQuery);
			  preparedStatement.setInt(1, userId);
			  
			  preparedStatement.executeUpdate();
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	// getUserById-method(display)
	public User getUserById(int userId) {
		String getById = "SELECT * FROM user WHERE userId = ?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(getById);
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				User user = new User();
				user.setUserId(resultSet.getInt("userId"));
				user.setUserName(resultSet.getString("userName"));
				user.setUserEmail(resultSet.getString("userEmail"));
				user.setUserPhone(resultSet.getLong("userPhone"));
				user.setUserGender(resultSet.getString("userGender"));
				user.setUserAddress(resultSet.getString("userAddress"));

				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//update-method
	public int updateUserDao(User user) {
		String updateQuery = "UPDATE user SET userName = ?, userEmail = ?, userPhone = ?, userGender = ?, userAddress = ? WHERE userId = ?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(updateQuery);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getUserEmail());
			preparedStatement.setLong(3, user.getUserPhone());
			preparedStatement.setString(4, user.getUserGender());
			preparedStatement.setString(5, user.getUserAddress());
			preparedStatement.setInt(6, user.getUserId());
			
			return preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}

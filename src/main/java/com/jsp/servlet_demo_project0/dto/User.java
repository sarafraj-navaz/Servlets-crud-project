package com.jsp.servlet_demo_project0.dto;

public class User {
	
	private int userId;
	private String userName;
	private String userEmail;
	private long userPhone;
	private String userGender;
	private String userAddress;
	


	public User(String userName, String userEmail, long userPhone, String userGender, String userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userGender = userGender;
		this.userAddress = userAddress;
	}
	

	public User(int userId, String userName, String userEmail, long userPhone, String userGender, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userGender = userGender;
		this.userAddress = userAddress;
	}


	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	

}
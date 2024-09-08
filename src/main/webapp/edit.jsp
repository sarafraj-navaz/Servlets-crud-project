<%@page import="com.jsp.servlet_demo_project0.dto.User"%>
<%@page import="com.jsp.servlet_demo_project0.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
	<% 
		int userId = Integer.parseInt(request.getParameter("id"));
		UserDao dao = new UserDao();
		User user = dao.getUserById(userId);
	%>

	<form action="editActionPage"  method="post">
		<lable>User Id</lable>
		<input type="number" name="id" placeholder="user id" value="<%=user.getUserId() %>" hidden="true">
		<br><br>
		<lable>User Name</lable>
		<input type="text" name="name" placeholder="user name" value="<%=user.getUserName() %>">
		<br> <br>
		<lable>Email</lable>
		<input type="text" name="email" placeholder="email" value="<%=user.getUserEmail()%>">
		<br> <br>
		<lable>Phone</lable>
		<input type="phone" name="phone" placeholder="phone" value="<%=user.getUserPhone()%>">
		<br> <br>
		<lable>Gender :</lable>
		<input type="radio" name="gender" value="male" checked="<%if(user.getUserGender().equalsIgnoreCase("Male")) {%>checked <%} else {%>unchecked<%} %>"> Male
		<input type="radio" name="gender" value="female" checked="<%if(user.getUserGender().equalsIgnoreCase("Female")) {%>checked <%} else {%>unchecked<%} %>"> Female
		<input type="radio" name="gender" value="other" checked="<%if(user.getUserGender().equalsIgnoreCase("Other")) {%>checked <%} else {%>unchecked<%} %>"> Other
		<br> <br>
		<lable>Address :</lable>
		<input type="text" name="address" placeholder="UserAddress" value="<%=user.getUserAddress()%>">
		<br> <br>
		<input type="submit" value="Update">		
	</form>
</body>
</html>
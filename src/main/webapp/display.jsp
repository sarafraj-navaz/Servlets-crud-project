<%@page import="com.jsp.servlet_demo_project0.dto.User"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.servlet_demo_project0.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	box-sizing: border-box;
	margin: 0%;
	padding: 0%;
}

table {
	border: 2px solid black;
}

table tr th {
	border: 3px solid black;
}

table tr td {
	border: 4px solid black;
}
</style>
</head>
<body>

	<%
	UserDao dao = new UserDao();
	List<User> users = dao.displayAll();
	%>
	<table>
		<tr>
			<th>UserId</th>
			<th>UserName</th>
			<th>UserEmail</th>
			<th>UserPhone</th>
			<th>UserGender</th>
			<th>UserAddress</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<%
		for (User user : users) {
		%>
		
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getUserName()%></td>
			<td><%=user.getUserEmail()%></td>
			<td><%=user.getUserPhone()%></td>
			<td><%=user.getUserGender()%></td>
			<td><%=user.getUserAddress()%></td>
			<td><a href="delete?id=<%=user.getUserId()%>"><button style="color : red">Delete</button></a></td>
			<td><a href="edit.jsp?id=<%=user.getUserId()%>"><button style="color : blue">Edit</button></a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
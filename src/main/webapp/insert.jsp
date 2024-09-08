<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="main">
		<form action="insert">
			<p>
				<input type="text" name="Username" placeholder="Username">
			</p>
			<p>
				<input type="email" name="Useremail" placeholder="email">
			</p>
			<p>
				<input type="tel" name="Number" placeholder="Usernumber">
			</p>
			<label>Gender:</label><br> <input type="radio" name="MyGender"
				value="Male">Male&nbsp; <input type="radio" name="MyGender"
				value="Female">Female&nbsp; <input type="radio"
				name="MyGender" value="Others">Others<br> <label>Address:</label><br>
			<select name="MyAddress">
				<option>NOIDA</option>
				<option>DELHI</option>
				<option>MUMBAI</option>
				<option>BENGALURU</option>
			</select><br>
		 <input type="submit" value="submit">
		</form>
	</div>
</body>
</html>
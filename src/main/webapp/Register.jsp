<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="register" method="post">
			<table align="center" style:"color:black">
			<tr>
			 	<td align="center" style="color:black" colspan="2">Registration</td>
			</tr>
			
			<tr>
			<td>Name</td>
			<td><input type="text" name="name" required /></td>
			</tr>
			
			<tr>
			<td>UserName</td>
			<td><input type="text" name="username" /></td>
			</tr>
			
			<tr>
			<td>Date of Birth</td>
			<td><input type="date" name="dob"/></td>
			</tr>
			
			<tr>
			<td>Phone Number</td>
			<td><input type="number" name="phonenumber"/>
			</td>
			</tr>
			
			<tr>
			<td>Email Id</td>
			<td><input type="email" name="email"/></td>
			</tr>
			
			<tr>
			<td>Password</td>
			<td><input type="password" name="password" required /></td>
			</tr>
			
			<tr>
			<td>Conform Password</td>
			<td><input type="password" name="conformpassword" required /></td>
			</tr>
			
			<tr>
			<td align="center"><input type="submit" value="Register user"></td>
			<td align="center"><input type="reset" value="reset"></td>
			</tr>
			
			</table>
		</form>
	</div>

</body>
</html>
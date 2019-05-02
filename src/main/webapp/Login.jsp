<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN FORM</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
<form method="post" action="login">
<div align="center" style="vertical-align:bottom">
<div align="center" style="vertical-align:bottom">
<table align="center" style="color:black">
<tr>
<td align="center" colspan="2"><b>LOG IN</b></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="username"  required/></td>
</tr>


<tr>
<td>Pass Word</td>
<td><input type="password" name="password"  /></td>
</tr>

<td>
<input type="submit" value="submit"/>

</td>
</table>
</form>
<p align="center"><a href="forgetpassword.jsp"><input type="submit" value="forgot password"/></a></p>
</body>
</html>
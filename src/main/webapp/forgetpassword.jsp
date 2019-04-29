<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setting new password</title>
</head>
<body>
<form method="post" action="password">
<table align="center" style="color:black">
<tr>
<td align="center" colspan="2"><b>change password</b></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="username" required/></td>
</tr>


<tr>
<td>PassWord</td>
<td><input type="password" name="password" /></td>
</tr>

<tr>
<td>Confirm PassWord</td>
<td><input type="password" name="confirmpassword" required/></td>
</tr>
<tr>
<td><input type="submit" value="submit">
<td>

</body>
</html>
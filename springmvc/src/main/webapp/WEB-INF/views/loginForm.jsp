<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<fieldset>
		<legend>Login</legend>
		<!-- <form action="./login" method="post"></form> -->
		<!-- <form action="./login1" method="post"> -->
		<!-- <form action="./login2" method="post"> -->
		<form action="./login3" method="post">
		<table>
			<tr>
				<td>Enter name</td>
				<td>:</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>Enter password</td>
				<td>:</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
		</form>
	</fieldset>
</body>
</html>
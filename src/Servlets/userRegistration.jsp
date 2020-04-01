<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@  page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Registration</title>
</head>
<body>
<div align="center"  style="padding-top:20px">
<h2>REGISTRATION PAGE</h2>
<form action="Registration" method="POST">
	<table>
		<tr>
			<td><input type= "text" name="lastName" placeholder="Your last name"/></td>
		</tr>
		 <tr>
			<td><input type= "text" name="firstName" placeholder="Your name"/></td>
		</tr>
		 <tr>
			<td><input type= "date" name="birthday" placeholder="Your birthday"/></td>
		</tr>
		 <tr>
			<td><input type= "text" name="email" placeholder="Your email"/></td>
		</tr>
		 <tr>
			<td><input type= "password" name="password" placeholder="Your password"/></td>
		</tr>
		<tr>
			<td><input type= "password" name="passwordCheck" placeholder="Repeat password"/></td>
		</tr>
			
		<tr>
			<td align="center"><input type= "submit" value="send"></td>
		</tr>
		</table>
		</form>
		
		
		<form action="login" method ="get">
		<table>
		<tr>
		
		<td align="left">
		<br> <input type="submit" value="Go to account" 
              onclick="window.location='WEB-INF/views/login.jsp';" />
              </td>
              </tr>
		</table>
	</div>	
</body>
</html>
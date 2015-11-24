<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/main.css" type="text/css"/>
<title>Login Page</title>
</head>
<body onload='document.f.username.focus();'>
	<h3>Login with Username and Password</h3>
	
	<c:if test ="${param.error != null}">
		
		
		<span class="loginerror">Loging failed</span>
	</c:if>
	<form name='f' action='/offers/login' method='POST'>
		<table class="formtable">
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
			<tr>
			<td>
			<input name="_csrf" type="hidden"
				value="0b9ff8e8-6282-487d-94b2-66e21540f080" />
				
				</td>
				</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/main.css" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate" commandName="offer">
	
		<table class ="formatable">
			<tr>
				<td class ="label">Name:</td>
				<td><sf:input  path ="name" name="name" type="text" />
				<br/>	<sf:errors path= "name" cssClass="error"></sf:errors></td>
				
			</tr>
			<tr>
				<td class ="label">Email:</td>
				<td><sf:input path ="email" name="email" type="text" />
				<br/><sf:errors path= "email" cssClass="error"></sf:errors></td>
			</tr>
				
			<tr>
				<td class ="label">Your Offer:</td>
				<td><sf:textarea path ="text"  name="text" rows="10" cols="10" ></sf:textarea>
					<br/>	<sf:errors path= "text" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class ="label"> </td>
				<td><input name="create adverte" type="submit"></td>


			</tr>
		</table>
	</sf:form>
</body>
</html>
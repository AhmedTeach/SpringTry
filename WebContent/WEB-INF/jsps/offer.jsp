<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/main.css" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="offers">
<tr><td> Name </td> <td> Email </td> <td> Offer </td>
</tr> 
<c:forEach var="offer" items="${offers}">

<tr><td><p><c:out value ="${offer.name}"></c:out></p></td>
<td><p><c:out value ="${offer.email}"></c:out></p></td>
<td><p><c:out value ="${offer.text}"></c:out></p></td>
</tr>
	
</c:forEach>
</table>
</body>
</html>
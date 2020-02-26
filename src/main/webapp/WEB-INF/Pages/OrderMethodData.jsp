<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OrderMethod</title>
</head>
<body>
	<h2>Welcome To Order Method Data Page</h2>
	<c:choose>
		<c:when test="${!empty fetchAllOrderMethodsData }">
			<table border="1">
				<tr>
				    <th>OrderMethod Id</th>
					<th>Order Mode</th>
					<th>Order Code</th>
					<th>Order Type</th>
					<th>Order Accept</th>
					<th>Description</th>
				</tr>
				<c:forEach items="${fetchAllOrderMethodsData }" var="ob">
					<tr>
					    <td>${ob.orderMethodId }</td>
						<td>${ob.orderMethodMode }</td>
						<td>${ob.orderMethodCode }</td>
						<td>${ob.orderMethodType }</td>
						<td>${ob.orderMethodAccept }</td>
						<td>${ob.orderMethodDescription }</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h2>No Data Found!!!</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>
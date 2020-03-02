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
	<h2>Welcome To OrderMethod Data Page</h2>
	 <a href="excel"><img src="../resources/images/Excel.png" width="115" height="35"></a> |
     <a href="pdf"><img src="../resources/images/Pdf.jpg" width="115" height="35"></a>
    
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
					<th colspan="3">Operations</th>
				</tr>
				<c:forEach items="${fetchAllOrderMethodsData }" var="ob">
					<tr>
					    <td>${ob.orderMethodId }</td>
						<td>${ob.orderMethodMode }</td>
						<td>${ob.orderMethodCode }</td>
						<td>${ob.orderMethodType }</td>
						<td>${ob.orderMethodAccept }</td>
						<td>${ob.orderMethodDescription }</td>
							<!-- URL-ReWritting -->
						<td><a href="delete?oid=${ob.orderMethodId }"><img src="../resources/images/Delete.jpg" width="40" height="30"></a></td>
						<td><a href="edit?oid=${ob.orderMethodId }"><img src="../resources/images/Edit.jpg" width="40" height="30"></a></td>
						<td><a href="view?oid=${ob.orderMethodId }"><img src="../resources/images/Search.png" width="40" height="30"></a></td>
						
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h2>No Data Found!!!</h2>
		</c:otherwise>
	</c:choose>
	${messageData} ${updateMessage}
</body>
</html>
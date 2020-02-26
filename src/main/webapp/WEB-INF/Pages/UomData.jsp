<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uom</title>
</head>
<body>
	<h2>Welcome to Uom Data Page</h2>
	<a href="excel">Excel Export</a> | <a href="pdf">Pdf Export</a>
	<c:choose>
		<c:when test="${!empty listUomData}">
			<table border="1">
				<tr>
					<th>Uom Id</th>
					<th>Uom Type</th>
					<th>Uom Model</th>
					<th>Description</th>
					<th colspan="3">Operations</th>
				</tr>
				<c:forEach items="${ listUomData}" var="uomObj">
					<tr>
						<td>${uomObj.uomId }</td>
						<td>${uomObj.uomType }</td>
						<td>${uomObj.uomModel }</td>
						<td>${uomObj.uomDescription }</td>
						<!-- URL-ReWritting -->
						<td><a href="delete?uid=${uomObj.uomId }">DELETE</a></td>
						<td><a href="edit?uid=${uomObj.uomId }">Edit</a></td>
						<td><a href="view?uid=${uomObj.uomId }">View</a></td>
					</tr>
				</c:forEach>
			</table>


		</c:when>
		<c:otherwise>
			<h2>No Data Found!!!!</h2>
		</c:otherwise>
	</c:choose>
	${UomMessage} ${updateMessage}
</body>
</html>

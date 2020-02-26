<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShipmentType</title>
</head>
<body>
	<h2>Welcome To ShipmentType Data Page</h2>
     <a href="excel">Excel Export</a> | <a href="pdf">Pdf Export</a>
	<c:choose>
		<c:when test="${!empty listData }">
			<table border="1">
				<tr>
					<th>Shipment ID</th>
					<th>Shipment Mode</th>
					<th>Shipment Code</th>
					<th>Shipment Enable</th>
					<th>Shipment Grade</th>
					<th>Description</th>
					<th colspan="3">Operations</th>
				</tr>
				<c:forEach items="${listData }" var="ob">
					<tr>
						<td>${ob.shipmentTypeId }</td>
						<td>${ob.shipmentMode }</td>
						<td>${ob.shipmentCode }</td>
						<td>${ob.shipmentEnable }</td>
						<td>${ob.shipmentGrade }</td>
						<td>${ob.shipmentDescr }</td>
						<!-- URL-ReWritting -->
						<td><a href="delete?sid=${ob.shipmentTypeId }">Delete</a></td>
						<td><a href="edit?sid=${ob.shipmentTypeId }">Edit</a></td>
						<td><a href="view?sid=${ob.shipmentTypeId }">View</a></td>
						
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
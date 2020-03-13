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
<h2>Welcome To Shipment Type View Page</h2>
<%@include file="ClientMenu.jsp"%>
<a href="excel?id=${showOneOrderMethodData.orderMethodId}">Excel Export</a>
<%-- <a href="excel?id=${showOneOrderMethodData.orderMethodId}"><img src="../resources/images/Excel.png" width="115" height="35"></a>  --%>
<a href="pdf?id=${showOneOrderMethodData.orderMethodId}"><img src="../resources/images/Pdf.jpg" width="115" height="35"></a>
<table border="1">
		<tr>
			<th>Order ID</th>
			<td>${showOneOrderMethodData.orderMethodId}</td>
		</tr>
		<tr>
			<th>Order Mode</th>
			<td>${showOneOrderMethodData.orderMethodMode}</td>
			
		</tr>
		<tr>
			<th>Order Code</th>
			<td>${showOneOrderMethodData.orderMethodCode}</td>
		</tr>
		<tr>
			<th>Order Type</th>
			<td>${showOneOrderMethodData.orderMethodType}</td>
		</tr>
		<tr>
			<th>Order Accept</th>
			<td>${showOneOrderMethodData.orderMethodAccept}</td>
		</tr>
		<tr>
			<th>Description</th>
			<td>${showOneOrderMethodData.orderMethodDescription}</td>
		</tr>
	</table>
</body>
</html>
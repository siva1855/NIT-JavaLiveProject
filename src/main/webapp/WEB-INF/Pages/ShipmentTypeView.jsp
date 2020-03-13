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
	<%@include file="ClientMenu.jsp"%>
	
			<h2>Welcome To ShipmentType View Page</h2>
		<!-- URL Re-writting -->
		<a href="excel?id=${showOneShipmentTypeObjectData.shipmentTypeId}"><img
			src="../resources/images/Excel.png" width="115" height="35"></a>
		<a href="pdf?id=${showOneShipmentTypeObjectData.shipmentTypeId}"><img
			src="../resources/images/Pdf.jpg" width="115" height="35"></a>

		<table border="1" >
			<tr >
				<th>Shipment ID</th>
				<td>${showOneShipmentTypeObjectData.shipmentTypeId}</td>
			</tr>
			<tr >
				<th>Shipment Mode</th>
				<td>${showOneShipmentTypeObjectData.shipmentTypeMode}</td>
			</tr>
			<tr >
				<th>Shipment Code</th>
				<td>${showOneShipmentTypeObjectData.shipmentTypeCode}</td>
			</tr>
			<tr >
				<th>Shipment Enable</th>
				<td>${showOneShipmentTypeObjectData.shipmentTypeEnable}</td>
			</tr>
			<tr >
				<th>Shipment Grade</th>
				<td>${showOneShipmentTypeObjectData.shipmentTypeGrade}</td>
			</tr>
			<tr >
				<th>Description</th>
				<td>${showOneShipmentTypeObjectData.shipmentTypeDescription}</td>
			</tr>
		</table>
		</body>
</html>
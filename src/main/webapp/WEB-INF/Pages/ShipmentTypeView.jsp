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
	<h2>Welcome To Shipment Type View Page</h2>
	
	<!-- URL Re-writting -->
	<a href="excel?id=${showOneShipmentTypeData.shipmentTypeId}">Excel Export</a> |
	<a href="pdf?id=${showOneShipmentTypeData.shipmentTypeId}">Pdf Export</a>
		
	<table border="1">
		<tr>
			<th>Shipment ID</th>
			<td>${showOneShipmentTypeData.shipmentTypeId}</td>
		</tr>
		<tr>
			<th>Shipment Mode</th>
			<td>${showOneShipmentTypeData.shipmentMode}</td>
		</tr>
		<tr>
			<th>Shipment Code</th>
			<td>${showOneShipmentTypeData.shipmentCode}</td>
		</tr>
		<tr>
			<th>Shipment Enable</th>
			<td>${showOneShipmentTypeData.shipmentEnable}</td>
		</tr>
		<tr>
			<th>Shipment Grade</th>
			<td>${showOneShipmentTypeData.shipmentGrade}</td>
		</tr>
		<tr>
			<th>Description</th>
			<td>${showOneShipmentTypeData.shipmentDescr}</td>
		</tr>
	</table>
</body>
</html>
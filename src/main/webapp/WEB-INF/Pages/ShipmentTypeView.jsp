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
	<div class="container">
		<div class="card">
			<div
				class="card-header bg-primary text-uppercase text-white text-center">
				<h2>Welcome To ShipmentType View Page</h2>
			</div>
			<div class="card-body">
				<!-- URL Re-writting -->
				<a href="excel?id=${showOneShipmentTypeObjectData.shipmentTypeId}"
					class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf?id=${showOneShipmentTypeObjectData.shipmentTypeId}"
					class="btn btn-secondary">PDF EXPORT</a>

				<table class="table table-bordered table-hover">
					<tr>
						<th>Shipment ID</th>
						<td>${showOneShipmentTypeObjectData.shipmentTypeId}</td>
					</tr>
					<tr>
						<th>Shipment Mode</th>
						<td>${showOneShipmentTypeObjectData.shipmentTypeMode}</td>
					</tr>
					<tr>
						<th>Shipment Code</th>
						<td>${showOneShipmentTypeObjectData.shipmentTypeCode}</td>
					</tr>
					<tr>
						<th>Shipment Enable</th>
						<td>${showOneShipmentTypeObjectData.shipmentTypeEnable}</td>
					</tr>
					<tr>
						<th>Shipment Grade</th>
						<td>${showOneShipmentTypeObjectData.shipmentTypeGrade}</td>
					</tr>
					<tr>
						<th>Description</th>
						<td>${showOneShipmentTypeObjectData.shipmentTypeDescription}</td>
					</tr>


				</table>
			</div>
		</div>
	</div>
</body>
</html>
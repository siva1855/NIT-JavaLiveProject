<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Part</title>
</head>
<body>
	<%@include file="ClientMenu.jsp"%>
	<div class="container">
		<div class="card">
			<div
				class="card-header bg-primary text-uppercase text-white text-center">
				<h2>Welcome To Part View Page</h2>
			</div>
			<div class="card-body">
				<!-- URL Re-writting -->
				<a href="excel?id=${showOnePartObjectData.partId}"
					class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf?id=${showOnePartObjectData.partId}"
					class="btn btn-secondary">PDF EXPORT</a>

				<table class="table table-bordered table-hover">
					<tr>
						<th>Part ID</th>
						<td>${showOnePartObjectData.partId}</td>
					</tr>
					<tr>
						<th>Part Code</th>
						<td>${showOnePartObjectData.partCode}</td>
					</tr>
					<tr>
						<th>Dimension Length</th>
						<td>${showOnePartObjectData.partDimensionLength}</td>
					</tr>
					<tr>
						<th>Dimension Width</th>
						<td>${showOnePartObjectData.partDimensionWidth}</td>
					</tr>
					<tr>
						<th>Dimension Height</th>
						<td>${showOnePartObjectData.partDimensionHeight}</td>
					</tr>
					<tr>
						<th>Base Cost</th>
						<td>${showOnePartObjectData.partBaseCost}</td>
					</tr>
					<tr>
						<th>Base Currency</th>
						<td>${showOnePartObjectData.partBaseCurrency}</td>
					</tr>
					<tr>
						<th>Uom Model</th>
						<td>${showOnePartObjectData.uomObj.uomModel}</td>
					</tr>
					<tr>
						<th>OrderMethod Sale</th>
						<td>${showOnePartObjectData.orderMethodSaleObj.orderMethodMode}</td>
					</tr>
					<tr>
						<th>OrderMethod Purchase</th>
						<td>${showOnePartObjectData.orderMethodPurchaseObj.orderMethodMode}</td>
					</tr>
					<tr>
						<th>Description</th>
						<td>${showOnePartObjectData.partDescription}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>

</body>
</html>
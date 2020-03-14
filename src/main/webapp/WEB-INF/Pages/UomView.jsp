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
	<%@include file="ClientMenu.jsp"%>
	<div class="container">
		<div class="card">
			<div
				class="card-header bg-primary text-uppercase text-white text-center">
				<h2>Welcome To Uom View Page</h2>
			</div>
			<div class="card-body">
				<!-- URL Re-writting -->
				<a href="excel?id=${showOneUomData.uomId}" class="btn btn-secondary">EXCEL EXPORT</a>
			    <a href="pdf?id=${showOneUomData.uomId}" class="btn btn-secondary">PDF EXPORT</a>

				<table class="table table-bordered table-hover">
					<tr>
						<th>Uom ID</th>
						<td>${showOneUomData.uomId}</td>
					</tr>
					<tr>
						<th>Uom Type</th>
						<td>${showOneUomData.uomType}</td>
					</tr>
					<tr>
						<th>Uom Model</th>
						<td>${showOneUomData.uomModel}</td>
					</tr>
					<tr>
						<th>Description</th>
						<td>${showOneUomData.uomDescription}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>

</body>
</html>
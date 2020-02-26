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
<h2>Welcome To Uom View Page</h2>
	
	<!-- URL Re-writting -->
	<a href="excel?id=${showOneUomData.uomId}">Excel Export</a> |
	<a href="pdf?id=${showOneUomData.uomId}">Pdf Export</a>
		
	<table border="1">
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
</body>
</html>
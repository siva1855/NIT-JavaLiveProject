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
	<%@include file="ClientMenu.jsp"%>
	<div class="container">

		<div class="card">

			<div class="card-header bg-primary text-uppercase text-white text-center">
				<h2>Welcome To OrderMethod View Page</h2>
			</div>
			<div class="card-body">

				<a href="excel?id=${showOneOrderMethodData.orderMethodId}"
					class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf?id=${showOneOrderMethodData.orderMethodId}"
					class="btn btn-secondary">PDF EXPORT</a>
					
				<table class="table table-bordered table-hover">
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
			</div>
		</div>
	</div>
</body>
</html>
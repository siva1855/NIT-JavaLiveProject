<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WhUserType</title>
</head>
<body>
	<%@include file="ClientMenu.jsp"%>

	<div class="container">

		<div class="card">
			<div
				class="card-header bg-primary text-uppercase text-white text-center">
				<h2>Welcome To WhUserType View Page</h2>
			</div>

			<div class="card-body">
				<!-- URL Re-writting -->
				<a href="excel?id=${showOneWhUserTypeObjectData.whUserTypeId}"
					class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf?id=${showOneWhUserTypeObjectData.whUserTypeId}"
					class="btn btn-secondary">PDF EXPORT</a>

				<table class="table table-bordered table-hover">
					<tr>
						<th>User ID</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeId}</td>
					</tr>
					<tr>
						<th>User Type</th>
						<td>${showOneWhUserTypeObjectData.whUserType}</td>
					</tr>
					<tr>
						<th>User Code</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeCode}</td>
					</tr>
					<tr>
						<th>User For</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeFor}</td>
					</tr>
					<tr>
						<th>User Mail</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeMail}</td>
					</tr>
					<tr>
						<th>User Contact</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeContact}</td>
					</tr>
					<tr>
						<th>User Id Type</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeIdType}</td>
					</tr>
					<tr>
						<th>If Other</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeIfOther}</td>
					</tr>
<tr>
						<th>User Id Number</th>
						<td>${showOneWhUserTypeObjectData.whUserTypeIdNumber}</td>
					</tr>

				</table>
			</div>
		</div>
	</div>
</body>
</html>
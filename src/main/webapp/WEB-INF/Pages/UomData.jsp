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
			<div class="card-header bg-primary text-uppercase text-white text-center">
				<h2>Welcome to Uom Data Page</h2>
			</div>
			<div class="card-body">
				<a href="excel" class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf" class="btn btn-secondary">PDF EXPORT</a>
				<c:choose>
					<c:when test="${!empty listUomData}">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<th>Uom Id</th>
								<th>Uom Type</th>
								<th>Uom Model</th>
								<th>Description</th>
								<th colspan="3">Operations</th>
							</tr>
							<c:forEach items="${ listUomData}" var="uomObj">
								<tr>
									<td>${uomObj.uomId }</td>
									<td>${uomObj.uomType }</td>
									<td>${uomObj.uomModel }</td>
									<td>${uomObj.uomDescription }</td>
									<!-- URL-ReWritting -->
									<td><a href="delete?uid=${uomObj.uomId }"
										class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?uid=${uomObj.uomId }"
										class="btn btn-info">EDIT</a></td>
									<td><a href="view?uid=${uomObj.uomId }"
										class="btn btn-warning">VIEW</a></td>
								</tr>
							</c:forEach>
						</table>

					</c:when>
					<c:otherwise>
						<h2>No Data Found!!!!</h2>
					</c:otherwise>
				</c:choose>
				${deleteOneUomData} ${updateUomObjectData}
			</div>
		</div>
	</div>

</body>
</html>

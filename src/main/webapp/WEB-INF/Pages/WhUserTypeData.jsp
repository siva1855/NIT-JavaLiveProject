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
				<h2>Welcome To WhUserType Data Page</h2>
			</div>
			<div class="card-body">
				<a href="excel" class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf" class="btn btn-secondary">PDF EXPORT</a>
				<c:choose>
					<c:when test="${!empty fetchAllWhUserTypesData }">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<th>User ID</th>
								<th>User Type</th>
								<th>User Code</th>
								<th>User For</th>
								<th>User Mail</th>
								<th>User Contact</th>
								<th>User Id Type</th>
								<th>User If Other</th>
								<th>User Id Number</th>
								<th colspan="3">Operations</th>
							</tr>
							<c:forEach items="${fetchAllWhUserTypesData }" var="ob">
								<tr>
									<td>${ob.whUserTypeId }</td>
									<td>${ob.whUserType }</td>
									<td>${ob.whUserTypeCode }</td>
									<td>${ob.whUserTypeFor }</td>
									<td>${ob.whUserTypeMail }</td>
									<td>${ob.whUserTypeContact }</td>
									<td>${ob.whUserTypeIdType }</td>
									<td>${ob.whUserTypeIfOther }</td>
									<td>${ob.whUserTypeIdNumber }</td>
									
									<!-- URL-ReWritting -->
									<td><a href="delete?wid=${ob.whUserTypeId }"
										class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?wid=${ob.whUserTypeId }"
										class="btn btn-info">EDIT</a></td>
									<td><a href="view?wid=${ob.whUserTypeId }"
										class="btn btn-warning">VIEW</a></td>
								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<h2>No Data Found!!!</h2>
					</c:otherwise>
				</c:choose>
			</div>
			<!-- card body -->
			<c:if test="${!empty deleteWhUserTypeTypeObjectData }">
				<div class="card-footer bg-info text-danger text-center">
					<b>${deleteWhUserTypeTypeObjectData}</b>
				</div>
			</c:if>

			<c:if test="${!empty updateShipmentTypeObjectData }">
				<div class="card-footer bg-info text-white text-center">
					<b>${updateShipmentTypeObjectData}</b>
				</div>
			</c:if>

		</div>
		<!-- card end -->

	</div>
	<!-- container end -->
</body>
</html>




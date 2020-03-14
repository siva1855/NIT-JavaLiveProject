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

			<div class="card-header bg-primary text-white text-center">
				<h2>Welcome To OrderMethod Data Page</h2>
			</div>
			<div class="card-body">
				<a href="excel" class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf" class="btn btn-secondary">PDF EXPORT</a>

				<c:choose>
					<c:when test="${!empty fetchAllOrderMethodsData }">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<th>OrderMethod Id</th>
								<th>Order Mode</th>
								<th>Order Code</th>
								<th>Order Type</th>
								<th>Order Accept</th>
								<th>Description</th>
								<th colspan="3">Operations</th>
							</tr>
							<c:forEach items="${fetchAllOrderMethodsData }" var="ob">
								<tr>
									<td>${ob.orderMethodId }</td>
									<td>${ob.orderMethodMode }</td>
									<td>${ob.orderMethodCode }</td>
									<td>${ob.orderMethodType }</td>
									<td>${ob.orderMethodAccept }</td>
									<td>${ob.orderMethodDescription }</td>
									<!-- URL-ReWritting -->
									<td><a href="delete?oid=${ob.orderMethodId }"
										class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?oid=${ob.orderMethodId }"
										class="btn btn-info">EDIT</a></td>
									<td><a href="view?oid=${ob.orderMethodId }"
										class="btn btn-warning">VIEW</a></td>

								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<h2>No Data Found!!!</h2>
					</c:otherwise>
				</c:choose>
				${deleteOrderMethodObjectData} ${updateOrderMethodObjectData}

				<%-- <c:if test="${!empty updateOrderMethodObjectData }">
					<c:choose>
						<c:when test="${opr eq 'DEL'}">
							<div class="card-footer bg-danger text-white text-center">
								<b>${deleteOrderMethodObjectData }</b>
							</div>
						</c:when>
						<c:otherwise>
							<div class="card-footer bg-info text-white text-center">
								<b>${updateOrderMethodObjectData }</b>
							</div>

						</c:otherwise>
					</c:choose>
				</c:if> --%>

			</div>
		</div>
	</div>

</body>
</html>
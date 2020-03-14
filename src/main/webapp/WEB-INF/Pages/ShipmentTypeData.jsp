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
				<h2>Welcome To ShipmentType Data Page</h2>
			</div>
			<div class="card-body">
				<a href="excel" class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf" class="btn btn-secondary">PDF EXPORT</a>

				<c:choose>
					<c:when test="${!empty fetchAllShipmentTypesData }">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<th>Shipment ID</th>
								<th>Shipment Mode</th>
								<th>Shipment Code</th>
								<th>Shipment Enable</th>
								<th>Shipment Grade</th>
								<th>Description</th>
								<th colspan="3">Operations</th>
							</tr>
							<c:forEach items="${fetchAllShipmentTypesData }" var="ob">
								<tr>
									<td>${ob.shipmentTypeId }</td>
									<td>${ob.shipmentTypeMode }</td>
									<td>${ob.shipmentTypeCode }</td>
									<td>${ob.shipmentTypeEnable }</td>
									<td>${ob.shipmentTypeGrade }</td>
									<td>${ob.shipmentTypeDescription }</td>
									<!-- URL-ReWritting -->
									<td><a href="delete?sid=${ob.shipmentTypeId }"
										class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?sid=${ob.shipmentTypeId }"
										class="btn btn-info">EDIT</a></td>
									<td><a href="view?sid=${ob.shipmentTypeId }"
										class="btn btn-warning">VIEW</a></td>
								</tr>
							</c:forEach>
						</table>

					</c:when>
					<c:otherwise>
						<h2>No Data Found!!!</h2>
					</c:otherwise>
				</c:choose>

				${deleteShipmentTypeObjectData} ${updateShipmentTypeObjectData}


			</div>
			<!-- card body -->
			
			<%-- <c:if test="${!empty message }">
				<c:choose>
					<c:when test="${opr eq 'DEL'}">
						<div class="card-footer bg-danger text-white text-center"><b>${message }</b></div>
					</c:when>
					<c:otherwise>
						<div class="card-footer bg-info text-white text-center"><b>${message }</b></div>
					
					</c:otherwise>
				</c:choose>
			</c:if> --%>


		</div>
		<!-- card end -->

	</div>
	<!-- container end -->
</body>
</html>




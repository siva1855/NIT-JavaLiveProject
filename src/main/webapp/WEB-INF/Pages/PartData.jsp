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
			<div class="card-header bg-primary text-white text-center text-uppercase">
				<h2>Welcome To Part Data Page</h2>
			</div>
			<div class="card-body">
				<a href="excel" class="btn btn-secondary">EXCEL EXPORT</a> <a
					href="pdf" class="btn btn-secondary">PDF EXPORT</a>

				<c:choose>
					<c:when test="${!empty fetchAllPartsData  }">
						<table class="table table-hover">
							<tr class="bg-success text-white">
								<th>PART ID</th>
								<th>PART CODE</th>
								<th>DIMENSION LENGTH</th>
								<th>DIMENSION WIDTH</th>
								<th>DIMENSION HEIGHT</th>
								<th>BASE COST</th>
								<th>BASE CURRENCY</th>
								<th>Uom</th>
								<th>OrderMethod Sale</th>
								<th>OrderMethod Purchase</th>
								<th>DESCRIPTION</th>
								<th colspan="3">Operations</th>
							</tr>
							<c:forEach items="${fetchAllPartsData }" var="ob">
								<tr>
									<td>${ob.partId }</td>
									<td>${ob.partCode }</td>
									<td>${ob.partDimensionLength }</td>
									<td>${ob.partDimensionWidth }</td>
									<td>${ob.partDimensionHeight }</td>
									<td>${ob.partBaseCost}</td>
									<td>${ob.partBaseCurrency}</td>
									<td>${ob.uomObj.uomModel}</td>
									<td>${ob.orderMethodSaleObj.orderMethodMode }
									<td>${ob.orderMethodPurchaseObj.orderMethodMode }
									<td>${ob.partDescription }</td>
									<!-- URL-ReWritting -->
									<td><a href="delete?pid=${ob.partId }"
										class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?pid=${ob.partId }"
										class="btn btn-info">EDIT</a></td>
									<td><a href="view?pid=${ob.partId }"
										class="btn btn-warning">VIEW</a></td>
								</tr>
							</c:forEach>
						</table>

					</c:when>
					<c:otherwise>
						<h2>No Data Found!!!</h2>
					</c:otherwise>
				</c:choose>
				
				${deletePartObjectData} ${updatePartObjectData}
				
			</div>
			<!-- card body -->

		</div><!-- card end -->
		
	</div>
	<!-- container end -->
</body>
</html>




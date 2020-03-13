<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				class="card-header bg-primary text-center text-white text-uppercase">
				<h2>Welcome to Part Register Page</h2>
			</div>

			<div class="card-body">
				<form:form action="save" method="POST" modelAttribute="part">

					<div class="row">
						<div class="col-4">
							<label for="partCode">CODE</label>
						</div>
						<div class="col-4">
							<form:input path="partCode" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partDimensionLength">Dimension Length</label>
						</div>
						<div class="col-4">
							<form:input path="partDimensionLength" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partDimensionWidth">Dimension Width</label>
						</div>
						<div class="col-4">
							<form:input path="partDimensionWidth" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partDimensionHeight">Dimension Height</label>
						</div>
						<div class="col-4">
							<form:input path="partDimensionHeight" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="partBaseCost">Base Cost</label>
						</div>
						<div class="col-4">
							<form:input path="partBaseCost" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="partBaseCurrency">Base Currency</label>
						</div>
						<div class="col-4">
							<form:select path="partBaseCurrency" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="INR">INR</form:option>
								<form:option value="USD">USD</form:option>
								<form:option value="AUS">AUS</form:option>
								<form:option value="ERU">ERU</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<!--Module Integreation Uom-->
					<div class="row">
						<div class="col-4">
							<label for="">Uom</label>
						</div>
						<div class="col-4">
							<form:select path="uomObj.uomId" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:options items="${CommonUIuomMapData}" />
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					
					<!--Module Integreation OrderMethod(Sale)-->
					<div class="row">
						<div class="col-4">
							<label for="">OrderMethod Sale</label>
						</div>
						<div class="col-4">
							<form:select path="orderMethodSaleObj.orderMethodId" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:options items="${CommonUIorderMethodSaleMapData}" />
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					
					<!--Module Integreation OrderMethod(Purchase)-->
					<div class="row">
						<div class="col-4">
							<label for="">OrderMethod Purchase</label>
						</div>
						<div class="col-4">
							<form:select path="orderMethodPurchaseObj.orderMethodId" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:options items="${CommonUIorderMethodPurchaseMapData}" />
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					

					<div class="row">
						<div class="col-4">
							<label for="partDescription">DESCRIPTION</label>
						</div>
						<div class="col-4">
							<form:textarea path="partDescription" class="form-control" />
						</div>
						<div class="col-4"></div>
					</div>

					<div class="row">
						<div class="col-4"></div>
						<div class="col-4">
							<input type="submit" value="Create Part" class="btn btn-success" />
							<input type="reset" value="Clear" class="btn btn-danger" />
						</div>
					</div>
				</form:form>
			</div>
			<c:if test="${!empty savePartRegisterData }">
				<div class="card-footer bg-info text-white text-center">
					<b>${savePartRegisterData}</b>
				</div>
			</c:if>
		</div>
		<!-- card end -->
	</div>
	<!-- container end -->
</body>
</html>
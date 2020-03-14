<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				<h2>Welcome To Part Edit Page</h2>
			</div>

			<div class="card-body">
				<form:form action="update" method="post" modelAttribute="part">
					<div class="row">
						<div class="col-4">
							<label for="partId">SHIPMENT ID</label>
						</div>
						<div class="col-4">
							<form:input path="partId" readonly="true" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

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
							<form:select path="orderMethodSaleObj.orderMethodId"
								class="form-control">
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
							<form:select path="orderMethodPurchaseObj.orderMethodId"
								class="form-control">
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
							<input type="submit" value="Update" class="btn btn-success" />
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
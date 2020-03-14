<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				class="card-header bg-primary text-center text-white text-uppercase">
				<h2>Welcome To ShipmentType Edit Page</h2>
			</div>

			<div class="card-body">
				<form:form action="update" method="POST"
					modelAttribute="shipmentType">
					<div class="row">
						<div class="col-4">
							<label for="shipmentTypeId">SHIPMENT ID</label>
						</div>
						<div class="col-4">
							<form:input path="shipmentTypeId" readonly="true"
								class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipmentTypeMode">SHIPMENT MODE</label>
						</div>
						<div class="col-4">
							<form:select path="shipmentTypeMode" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="Air">Air</form:option>
								<form:option value="Truck">Truck</form:option>
								<form:option value="Ship">Ship</form:option>
								<form:option value="Train">Train</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipmentTypeCode">SHIPMENT CODE</label>
						</div>
						<div class="col-4">
							<form:input path="shipmentTypeCode" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipmentTypeEnable">ENABLE SHIPMENT</label>
						</div>
						<div class="col-4">
							<form:select path="shipmentTypeEnable" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="YES">YES</form:option>
								<form:option value="NO">NO</form:option>
							</form:select>
						</div>
						<div class="col-4"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipmentTypeGrade">SHIPMENT GRADE</label>
						</div>
						<div class="col-4">
							<form:radiobutton path="shipmentTypeGrade" value="A" />
							A
							<form:radiobutton path="shipmentTypeGrade" value="B" />
							B
							<form:radiobutton path="shipmentTypeGrade" value="C" />
							C
						</div>
						<div class="col-4"></div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="shipmentTypeDescription">DESCRIPTION</label>
						</div>
						<div class="col-4">
							<form:textarea path="shipmentTypeDescription"
								class="form-control" />
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
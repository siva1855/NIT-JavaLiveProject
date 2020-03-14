<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<div class="card-header bg-primary text-center text-white text-uppercase">
				<h2>Welcome To Uom Edit Page</h2>
			</div>
			<div class="card-body">
				<form:form action="update" method="post" modelAttribute="uom">
					<div class="row">
						<div class="col-4">
							<label for="uomId">Uom ID</label>
						</div>
						<div class="col-4">
							<form:input path="uomId" readonly="true" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="uomType">Uom Type</label>
						</div>
						<div class="col-4">
							<form:select path="uomType" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="PACKING">PACKING</form:option>
								<form:option value="NO-PACKING">NO-PACKING</form:option>
								<form:option value="-NA-">-NA-</form:option>
							</form:select>
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="uomModel">Uom Model</label>
						</div>
						<div class="col-4">
							<form:input path="uomModel" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>
					<div class="row">
						<div class="col-4">
							<label for="uomDescription">DESCRIPTION</label>
						</div>
						<div class="col-4">
							<form:textarea path="uomDescription" class="form-control" />
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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<div class="card-header bg-primary text-center text-white text-uppercase">
				<h2>Welcome To WhUserType Edit Page</h2>
			</div>

			<div class="card-body">

				<form:form action="update" method="POST" modelAttribute="whUserType">

					<div class="row">
						<div class="col-4">
							<label for="whUserTypeId">User ID</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeId" readonly="true" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="whUserType">User Type</label>
						</div>
						<div class="col-4">
							<form:radiobutton path="whUserType" value="Vendor" />Vendor
							<form:radiobutton path="whUserType" value="Customer" />Vendor
						</div>
						<div class="col-4">
						   <!-- Error Message -->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="whUserTypeCode">User Code</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeCode" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="whUserTypeFor">User For</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeFor" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="whUserTypeMail">User Mail</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeMail" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="whUserTypeContact">User Contact</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeContact" class="form-control" />
						</div>
						<div class="col-4">
							<!-- Error Message -->
						</div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="whUserTypeIdType">User Id Type</label>
						</div>
						<div class="col-4">
							<form:select path="whUserTypeIdType" class="form-control">
								<form:option value="">-SELECT-</form:option>
								<form:option value="PANCARD">PANCARD</form:option>
								<form:option value="AADHAAR CARD">AADHAAR CARD</form:option>
								<form:option value="VOTER ID">VOTER ID</form:option>
								<form:option value="OTHER">OTHER</form:option>
							</form:select>
						</div>
						<div class="col-4"></div>
					</div>


					<div class="row">
						<div class="col-4">
							<label for="whUserTypeIfOther">*If Other</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeIfOther" class="form-control" />
						</div>
						<div class="col-4">
							<!--  Error Message-->
						</div>
					</div>

					<div class="row">
						<div class="col-4">
							<label for="whUserTypeIdNumber">Id Number</label>
						</div>
						<div class="col-4">
							<form:input path="whUserTypeIdNumber" class="form-control" />
						</div>
						<div class="col-4">
							<!--  Error Message-->
						</div>
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
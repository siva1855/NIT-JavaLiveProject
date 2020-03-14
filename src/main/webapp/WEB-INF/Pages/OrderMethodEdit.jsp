<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<div class="card-header bg-primary text-center text-white text-uppercase">
				<h2>Welcome To OrderMethod Edit Page</h2>
				</div>
				<div class="card-body">
					<form:form action="update" method="post" modelAttribute="orderMethod">
						<div class="row">
							<div class="col-4">
								<label for="orderMethodId">Order ID</label>
							</div>
							<div class="col-4">
								<form:input path="orderMethodId" readonly="true"
									class="form-control" />
							</div>
							<div class="col-4">
								<!-- Error Message -->
							</div>
						</div>

						<div class="row">
							<div class="col-4">
								<label for="orderMethodMode">Order Mode</label>
							</div>
							<div class="col-4">
								<form:radiobutton path="orderMethodMode" value="Sale" />
								Sale
								<form:radiobutton path="orderMethodMode" value="Purchase" />
								Purchase
							</div>
							<div class="col-4"></div>
						</div>

						<div class="row">
							<div class="col-4">
								<label for="orderMethodCode">Order Code</label>
							</div>
							<div class="col-4">
								<form:input path="orderMethodCode" class="form-control" />
							</div>
							<div class="col-4">
								<!-- Error Message -->
							</div>
						</div>

						<div class="row">
							<div class="col-4">
								<label for="orderMethodType">Order Type</label>
							</div>
							<div class="col-4">
								<form:select path="orderMethodType" class="form-control">
									<form:option value="">-SELECT-</form:option>
									<form:option value="FIFO">FIFO</form:option>
									<form:option value="LIFO">LIFO</form:option>
									<form:option value="FCFO">FCFO</form:option>
									<form:option value="FEFO">FEFO</form:option>
								</form:select>
							</div>
							<div class="col-4">
								<!-- Error Message -->
							</div>
						</div>

						<div class="row">
							<div class="col-4">
								<label for="orderMethodAccept">Order Accept</label>
							</div>
							<div class="col-4">

								<form:checkbox path="orderMethodAccept" value="Multi-Model" />
								Multi-Model
								<form:checkbox path="orderMethodAccept" value="Accept-Return" />
								Accept-Return
							</div>
						</div>
						
						<div class="row">
							<div class="col-4">
								<label for="orderMethodDescription">Description</label>
							</div>
							<div class="col-4">
								<form:textarea path="orderMethodDescription"
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
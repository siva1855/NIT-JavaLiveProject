<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShipmentType</title>
</head>
<body>
<%@include file="ClientMenu.jsp"%>
	<h2>Welcome To ShipmentType Edit Page</h2>
	<form:form action="update" method="post" modelAttribute="shipmentType">
		<pre>
             Shipment Id:<form:input path="shipmentTypeId" readonly="true" />
             Shipment Mode:<form:select path="shipmentTypeMode">
                             <form:option value="">--Select--</form:option>
				             <form:option value="Air">Air</form:option>
				             <form:option value="Truck">Truck</form:option>
				             <form:option value="Ship">Ship</form:option>
				             <form:option value="Train">Train</form:option>
			             </form:select>
           Shipment Code:<form:input path="shipmentTypeCode" />
           Enable Shipment:<form:select path="shipmentTypeEnable">
                              <form:option value="">--Select--</form:option>
				              <form:option value="Yes">Yes</form:option>
				              <form:option value="No">No</form:option>
			               </form:select>
           Shipment Grade:<form:radiobutton path="shipmentTypeGrade" value="A" />A
                          <form:radiobutton path="shipmentTypeGrade" value="B" />B
                          <form:radiobutton path="shipmentTypeGrade" value="C" />C
                          <form:radiobutton path="shipmentTypeGrade" value="D" />D
           Description:<form:textarea path="shipmentTypeDescription"></form:textarea>
                     <input type="submit" value="Update" />
      </pre>
	</form:form>
</body>
</html>
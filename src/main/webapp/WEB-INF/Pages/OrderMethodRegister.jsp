<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OrderMethod</title>
</head>
<body>
	<h2>Welcome to Order Method Register Page</h2>
	<form:form action="save" method="POST" modelAttribute="orderMethod">
		<pre>
           Order Mode:<form:radiobutton path="" value="Sale" />Sale
                      <form:radiobutton path="" value="Purchase" />Purchase
           Order Code:<form:input path="" />
           Order Type:<form:select path="">
                            <form:option value="">--Select--</form:option>
				            <form:option value="FIFO">FIFO</form:option>
				            <form:option value="LIFO">LIFO</form:option>
				            <form:option value="FCFO">FCFO</form:option>
				            <form:option value="FEFO">FEFO</form:option>
			            </form:select>
            Order Accept:<form:checkbox path="" value="Multi-Model" />Multi-Model
                        <form:checkbox path="" value="Accept Return" />Accept Return
            Description:<form:textarea path="shipmentDescr"></form:textarea>
                     <input type="submit" value="Create Order Method" />
       </pre>
	</form:form>
 </body>
</html>
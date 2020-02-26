<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uom</title>
</head>
<body>
	<h2>Welcome to Uom Register Page</h2>
	<form:form action="save" method="POST" modelAttribute="uom">
		<pre>
             Uom Type:<form:select path="uomType">
                             <form:option value="">--Select--</form:option>
				             <form:option value="PACKING">PACKING</form:option>
				             <form:option value="NO-PACKING">NO-PACKING</form:option>
				             <form:option value="-NA-">-NA-</form:option>
			             </form:select>
             Uom Model:<form:input path="uomModel" />
             Description:<form:textarea path="uomDescription"></form:textarea>
                      <input type="submit" value="Create Uom">
        </pre>
	</form:form>
	${UomMessage}
</body>
</html>
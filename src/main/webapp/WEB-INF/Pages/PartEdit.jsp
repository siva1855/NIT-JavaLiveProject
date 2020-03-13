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
	<h2>Welcome To Part Edit Page</h2>
	<form:form action="update" method="post" modelAttribute="part">
		<pre>
             Part Id:<form:input path="partId" readonly="true" />
             Part Code:<form:input path="partCode" />
             
             Dimension Length:<form:input path="partDimensionLength" />
             Dimension Width:<form:input path="partDimensionWidth" />
             Dimension Height:<form:input path="partDimensionHeight" />
             Base Cost:<form:input path="partBaseCost" />
             
             Base Currency:<form:select path="partBaseCurrency">
                             <form:option value="">--Select--</form:option>
				             <form:option value="INR">INR</form:option>
				             <form:option value="USD">USD</form:option>
				             <form:option value="AUS">AUS</form:option>
				             <form:option value="ERU">ERU</form:option>
			             </form:select>
			  Uom:<form:select path="uomObj.uomId">
			            <form:option value="">--Select--</form:option>
			            <form:options items="${CommonUIuomMapData}"
			                                  itemValue="uomId"
			                                  itemLabel="uomModel"/>
			        </form:select>   
			   OrderMethod Sale:<form:select path="orderMethodSaleObj.orderMethodId">
			            <form:option value="">--Select--</form:option>
			            <form:options items="${CommonUIorderMethodSaleMapData}"
			                                  itemValue="orderMethodId"
			                                  itemLabel="orderMethodMode"/>
			        </form:select>
			   OrderMethod Purchase:<form:select path="orderMethodPurchaseObj.orderMethodId">
			            <form:option value="">--Select--</form:option>
			            <form:options items="${CommonUIorderMethodPurchaseMapData}"
			                                  itemValue="orderMethodId"
			                                  itemLabel="orderMethodMode"/>
			        </form:select>           
           Description:<form:textarea path="partDescription"></form:textarea>
                     <input type="submit" value="Update" />
      </pre>
	</form:form>
</body>
</html>
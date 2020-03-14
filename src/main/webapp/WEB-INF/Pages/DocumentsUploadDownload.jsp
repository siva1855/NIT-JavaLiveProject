<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DocumentsUploadDownload</title>
</head>
<body>
	<%@include file="ClientMenu.jsp"%>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-center text-white text-uppercase">
				<h2>Welcome To DocumentsUploadDownload Page</h2>
			</div>

			<form action="upload" method="post" enctype="multipart/form-data">
				<pre>			
                     Document ID:<input type="text" name="fileId" />
                     Choose Document: <input type="file" name="fileObject" />
                     <input type="submit" value="Upload" class="btn btn-warning" />          
	            </pre>
			</form>

			<table class="table table-hover">
				<tr class="bg-success text-white">
					<th>File ID</th>
					<th>File Name</th>
					<th>Download</th>
				</tr>
				<c:forEach items="${showDocumentsUploadData}" var="obj">
					<tr>
						<td>${obj[0] }</td>
						<td>${obj[1] }</td>
						<td><a href="download?fid=${obj[0]}" class="btn btn-info">Download</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
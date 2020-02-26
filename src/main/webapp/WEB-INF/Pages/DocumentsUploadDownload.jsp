<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DocumentsUpload</title>
</head>
<body>
	<h2>Welcome To Documents Upload Page</h2>
	<form action="upload" method="post" enctype="multipart/form-data">
		<pre>
           Document ID:<input type="text" name="fileId" />
           Choose Document: <input type="file" name="fileObject" />
                  <input type="submit" value="Upload" />
	  </pre>
	</form>
	<table border="1">
		<tr>
			<th>File ID</th>
			<th>File Name</th>
			<th>Download</th>
		</tr>
		<c:forEach items="${showDocumentsUploadData}" var="obj">
			<tr>
				<td>${obj[0] }</td>
				<td>${obj[1] }</td>
				<td><a href="download?fid=${obj[0]}">Download</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
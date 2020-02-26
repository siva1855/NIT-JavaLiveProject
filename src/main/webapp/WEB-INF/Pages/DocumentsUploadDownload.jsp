<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
                  <input type="submit" value="Upload"/>
       </pre>

	</form>
	${doUploadMessage}
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>upload form</h1>
	<form enctype="multipart/form-data" action="<%=request.getContextPath() %>/upload_process.abc" method="post">
		<input type="text" name="title"><br>
		<input type="file" name="file1"><br>
		<input type="file" name="file2"><br>
		<input type="file" name="file3"><br>
		<input type="submit" value="확인"> 
	</form>
</body>
</html>
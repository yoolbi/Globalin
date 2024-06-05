<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>form.jsp</h1>
	<form action="<%=request.getContextPath() %>/calc.abc" method="get">
		<input type="text" name="num1">
		<input type="text" name="num2">
		<input type="submit" value="확인">
	</form>
</body>
</html>
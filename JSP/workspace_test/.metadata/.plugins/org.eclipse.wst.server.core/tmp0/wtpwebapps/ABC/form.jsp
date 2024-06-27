<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>form.jsp</h1>
	<form action="<%=request.getContextPath() %>/calc.do" method="get">
		<input type="text" name="num1" />
		<input type="text" name="num2" />
		<input type="submit" value="확인" />
	
	</form>
</body>
</html>
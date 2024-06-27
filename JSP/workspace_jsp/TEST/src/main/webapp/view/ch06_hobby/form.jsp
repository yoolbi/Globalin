<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>취미 폼</h1>
	<form action="<%=request.getContextPath() %>/form_process.do" method="post">
		<input type="text" name="mName" placeholder="회원명"><br>
		<input type="checkbox" name="hobby" value="운동">운동
		<input type="checkbox" name="hobby" value="영화">영화
		<input type="checkbox" name="hobby" value="여행">여행
		<input type="checkbox" name="hobby" value="등산">등산
		<input type="submit" value="확인">
	</form>
</body>
</html>
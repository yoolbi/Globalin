<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 상태</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("id");
		String password = request.getParameter("passwd");
		/*if ("scott".equals(userid) && "tiger".equals(password)) {
			out.print("<h3>로그인 성공</h3>");
		} else {
			out.print("<h3>로그인 실패</h3>");
		}*/
	%>
	<p>아이디 : <%=userid%>
	<p>비밀번호 : <%=password%>
	<h3>로그인 성공</h3>
</body>
</html>
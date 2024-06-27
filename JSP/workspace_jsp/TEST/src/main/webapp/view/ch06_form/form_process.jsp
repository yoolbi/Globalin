<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>form_process.jsp</h1>
	<%= request.getAttribute("mName") %> <br>
	<%
		String[] hobby = (String[])request.getAttribute("hobby");
		for (int i = 0; i < hobby.length; i++) {
			out.print(hobby[i] + "<br>");
		}
	%>
</body>
</html>
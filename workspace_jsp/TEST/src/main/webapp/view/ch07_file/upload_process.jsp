<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>upload_process</h1>
	<h3><%=request.getAttribute("title") %></h3>
	<%
		List<String> oriFileNameList = (List)request.getAttribute("oriFileNameList");
		for (String oriFileName : oriFileNameList) {
			out.print(oriFileName + "<br>");
		}
		List<String> newFileNameList = (List)request.getAttribute("newFileNameList");
		for (String newFileName : newFileNameList) {
			out.print(newFileName + "<br>");
		}
	%>
</body>
</html>
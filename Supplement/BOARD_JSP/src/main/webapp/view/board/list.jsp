<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	list.jsp
	<table>
		<tr>
			<td>seq</td>
			<td>title</td>
			<td>createdate</td>
		</tr>
	<%
		ResultSet rs = (ResultSet)request.getAttribute("list");
		while(rs.next()){
			
	%>
		<tr>
			<td><%=rs.getString("seq") %></td>
			<td><a href="/BOARD_JSP/board/read.glo?seq=<%=rs.getString("seq") %>"><%=rs.getString("title") %></a></td>
			<td><%=rs.getString("createdate") %></td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>
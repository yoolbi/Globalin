<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
		<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.seq}</td>
				<td><a href="/board/read?seq=${board.seq}">${board.title}</a></td>
				<td>${board.createdate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
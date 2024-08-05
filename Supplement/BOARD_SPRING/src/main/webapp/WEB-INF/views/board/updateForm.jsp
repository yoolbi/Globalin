<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	updateForm.jsp
	<br>
	<c:forEach var="board" items="${list }">
		<form action="/board/update" method="post">
			<input type="hidden" name="seq" value="${board.seq }"/>
			<input type="text" name="title" value="${board.title }" placeholder="title"/><br>
			<input type="text" name="content" value="${board.content }" placeholder="content"/><br>
			<input type="submit" value="submit"/>
		</form>
	</c:forEach>
</body>
</html>
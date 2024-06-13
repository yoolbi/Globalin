<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>menu.jsp</h1>
	<c:if test="${ !empty sessionScope.userId }">
		${sessionScope.userId } 
		<a href="<c:url value='/logout_process.coffee'/>">ログアウト</a>
	</c:if>
	<c:if test="${ empty sessionScope.userId }">
		ログインください。
		<a href="<c:url value='/'/>">ホームページ</a>
	</c:if>
</body>
</html>
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
	<h1>login.jsp</h1>
	<form action="'<c:url value="/login_process.coffee"/>" method="post">
		<input type="text" name="userId" placeholder="ユーザーアイディー"><br>
		<input type="text" name="userPw" placeholder="ユーザーパスワード"><br>
		<input type="submit" value="ログイン">
	</form>
</body>
</html>
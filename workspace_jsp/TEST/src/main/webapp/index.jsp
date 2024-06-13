<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>
	<h1>index.jsp</h1>
	<ul>
		<li id="calc">계산기</li>
		<li id="login">로그인</li>
		<li id="hobby">취미</li>
		<li id="upload">파일 업로드</li>
		<li id="sessionLogin">세션로그인</li>
	</ul>
	<script>
		document.getElementById('calc').addEventListener('click',function(){
			document.location.href = '<%=request.getContextPath() %>/form.do';
			
		});
		document.getElementById('login').addEventListener('click',function(){
			document.location.href = '<%=request.getContextPath() %>/login.do';
			
		});
		document.getElementById('hobby').addEventListener('click',function(){
			document.location.href = '<%=request.getContextPath() %>/hobby.do';
			
		});
		document.getElementById('upload').addEventListener('click',function(){
			document.location.href = '<%=request.getContextPath() %>/upload.abc';
			
		});
		document.getElementById('sessionLogin').addEventListener('click', function() {
			document.location.href = '<c:url value="/login.coffee"/>';
		});
	</script>
</body>
</html>
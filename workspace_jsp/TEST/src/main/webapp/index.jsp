<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<ul>
		<li id="calc">계산기</li>
		<li id="login">로그인</li>
		<li id="hobby">취미</li>
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
	</script>
</body>
</html>
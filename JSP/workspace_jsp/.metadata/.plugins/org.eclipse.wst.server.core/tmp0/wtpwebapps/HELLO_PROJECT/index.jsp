<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<ul>
		<li id="calc">계산기</li>
	</ul>
	<script>
		document.getElementById('calc').addEventListener('click',function(){
			document.location.href = '<%=request.getContextPath() %>/form.abc';
			
		});
	</script>
</body>
</html>
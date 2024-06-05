<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<ul>
		<li id="calc">계산기</li>
	</ul>
	<script>
		document.getElementById("calc").addEventListener("click", function() {
			document.location.href = "<%=request.getContextPath() %>/form.do";
		});
	</script>
</body>
</html>
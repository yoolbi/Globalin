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
	read.jsp
	<table>
		<c:forEach var="board" items="${list}">
			<tr>
				<td>seq</td>
				<td>${board.seq}</td>
			</tr>
			<tr>
				<td>title</td>
				<td>${board.title}</td>
			</tr>
			<tr>
				<td>content</td>
				<td>${board.content}</td>
			</tr>
			<tr>
				<td>createdate</td>
				<td>${board.createdate}</td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<input type="button" id="btnDelete" value="delete"/>
		<input type="button" id="btnModify" value="modify"/>
	</div>
	<script>
		document.getElementById('btnDelete').addEventListener('click', function(){
			if(confirm('delete.. ok?')){
				document.location.href = '/board/delete?seq=<%=request.getParameter("seq")%>';
			}
		});
		document.getElementById('btnModify').addEventListener('click', function(){
			document.location.href = '/board/updateForm?seq=<%=request.getParameter("seq")%>';
		});
	</script>
	
	
	
	
	
	
</body>
</html>
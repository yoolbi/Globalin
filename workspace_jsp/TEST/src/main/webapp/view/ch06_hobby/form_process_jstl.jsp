<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hobby</title>
<style>
	.trip {
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<h1>hobby</h1>
    ${mName} (${fn:length(hobbys)})<br>
    <c:forEach var="hobby" items="${requestScope.hobbys}">
    	<c:if test="${hobby == '여행' }">
    		<span class="trip">${hobby }</span><br>
    	</c:if>
        <c:if test="${hobby != '여행' }">
    		<span style="">${hobby }</span><br>
    	</c:if>
    </c:forEach>
</body>
</html>
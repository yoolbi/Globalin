<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2>Test POST Request</h2>
<form action="/lol/info" method="post">
    <input type="text" id="lolID" name="lolID" placeholder="롤아이디">
    <select name="tier">
    	<option value="골드">골드</option>
    	<option value="실버">실버</option>
    	<option value="브론즈">브론즈</option>
    </select>
    <input type="submit" value="제출">
</form>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
    <form action = "process.jsp" method = "POST">
        <p> ����<input type = "checkbox" name = "reading">
            �<input type ="checkbox" name ="exercise">
            ��ȭ<input type = "checkbox" name ="movie">
        <p> <input type = "submit" value = "����">
    </form>
</body>
</html>
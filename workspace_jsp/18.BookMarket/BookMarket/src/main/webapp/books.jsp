﻿<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
 <link href = "./resources/css/bootstrap.min.css" rel="stylesheet">

<title>도서 목록</title>
</head>
<body>
<div class="container py-4">
   <%@ include file="menu.jsp"%>	
   
   <div class="p-5 mb-4 bg-body-tertiary rounded-3">
      <div class="container-fluid py-5">
        <h1 class="display-5 fw-bold">도서목록</h1>
        <p class="col-md-8 fs-4">BookList</p>      
      </div>
    </div>
	 <%@ include file="dbconn.jsp" %>
	 
	 <div class="row align-items-md-stretch   text-center">	 	
	 <%
	    PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from book";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
	  %>
     	<div class="col-md-4">
       		<div class="h-100 p-2">	
       			<img src="./resources/images/<%=rs.getString("b_filename")%>" style="width: 250; height:350" />		
				<h5><b><%=rs.getString("b_name")%></b></h5>
				<p><%=rs.getString("b_author")%>
				<br> <%=rs.getString("b_publisher")%> | <%=rs.getString("b_unitPrice")%>원
				<p> <%=rs.getString("b_description").substring(0,60)%>....
				<p><%=rs.getString("b_unitPrice")%>원
				<p><a href="./book.jsp?id=<%=rs.getString("b_id")%>" class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a>	</div>	
		</div>			
		<%
			}
		if (rs != null) 
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		%>	
		</div>	
		<%@ include file="footer.jsp"%>   
  </div>
</body>
</html>

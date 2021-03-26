<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String major = request.getParameter("major");
		String passwd= request.getParameter("passwd");
	
%>
	<h2>이름:<%=name %></h2>
	<h2>전공:<%=major %></h2>
	<h2>비밀번호:<%=passwd %></h2>
</body>
</html>
<!-- String name = request.getParameterValues("name"); -->
<!-- for(int i=0; i< name.length; i++) {
	String str = name[i]

	%
}
	%
 -->
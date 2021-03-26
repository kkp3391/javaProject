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
		String sex = request.getParameter("sex");
		String year= request.getParameter("year");
	//	String subject= request.getParameter("subject");
		
		String[] subjects = request.getParameterValues("subject"); 
		 
%>


 <table border="1" style="width:30%">
	<tr>
		<td><h2>이름:<%=name %></h2></td>
	</tr>
	<tr>
		<td><h2>성별:<%=sex %></h2></td>
	</tr>
	<tr>
		<td><h2>학년:<%=year %></h2></td>
	</tr>
	<tr>
	<td>
		<%for(int i=0; i< subjects.length; i++) {
			 String str = subjects[i]; 
			%>
			<a><%=str %></a>
		<% }%>
		</td>
	</tr>
</table>
</body>
</html>
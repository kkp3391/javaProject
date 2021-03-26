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
		<td><h2>이름</h2></td>
	<td><%=name %></td>
	</tr>
	<tr>
		<td><h2>성별</h2></td>
		<td><%=sex %></td>
	</tr>
	<tr>
		<td><h2>학년</h2></td>
		<td><%=year %></td>
	</tr>
	<tr>
	<td><h2>관심</h2></td>
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
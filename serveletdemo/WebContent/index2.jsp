<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- this is html commecnt -->
<%-- this is jsp commecnt --%>
<%-- <%@include file="index.jsp"%> --%>
<h2>This is index2 page</h2>
<%
	int a=10,b=20;
	if(a>b)
	{
 %>
		<b>a is greater</b>
<% 
	}
	else
	{
%>
		"b is greater"
<% 
	}
%>
</body>
</html>
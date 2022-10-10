<%-- page tag --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- comment in html -->
<%-- comment in jsp --%>

<%-- directive tag --%>
<%@include file ="index.html" %>

<%-- scriptive tag--%>
<%
	int a=30,b=20;
	if(a>b)
	{
%>
		<b>a is greater</b>
<% 		
	}

	else
	{
%>
		
		<b>b is greter</b>
<%
	}
%>
<%-- regular expression tag for front end to fetch data from backend --%>
<%=  %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%-- syntax of identify jsp page 

	<%@	page language = "java" contentType = "text/html"%>
	
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>index1 content</h1>
<!-- <h1>This is html page</h1>  -->
<%-- <h1>This is java server page</h1> --%>
<%-- use include for adding content from anither file --%>
<%@ include file = "index2.jsp" %>
<%
	int a=30,b=20;
	
		if(a>b)
		{
%>
			"a is greater"
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
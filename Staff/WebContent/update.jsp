<%@page import="com.bean.employee"%>
<%@page import="com.dao.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update form</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>	
</head>
<body>
<%
	employee e = (employee)(request.getAttribute("emp"));
%>
<form name ="insert" method="post" action="employeecontroller" >
	<h1 align ="center">update Form</h1>
	<table align ="center">

		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=e.getFname() %>"></td>	
		</tr>
		
		<tr>
			<td>Last Name</td>
			<td><input type ="text" name="lname" value="<%=e.getLname() %>"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="update" name="action"></td>
		</tr>
	</table>
</form>
</body>
</html>
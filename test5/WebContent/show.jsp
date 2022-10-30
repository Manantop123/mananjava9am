<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.employee"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.empdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login Form</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
<h1>show page</h1>

<table class ="table"> 
	<tr>
		<th>id</th>
		<th>fname</th>
	</tr>
	<%
	List<employee> list = empdao.getallemployee();
	for(employee e : list)
	{
	%>
	<tr>
		<td><%= e.getId() %></td>
		<td><%= e.getFname() %></td>
		<td><input type ="submit"  name ="action" value ="edit" class="btn btn-primary"></td>
		<td><input type ="submit" name ="action" value ="delete" class ="btn btn-danger"></td>
	</tr>
	<% 	
	}
	%>
</table>
</body>
</html>
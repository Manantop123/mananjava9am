<%@page import="java.util.List"%>
<%@page import="com.bean.employeebean"%>
<%@page import="com.dao.employeedao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link rel ="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</head>
<body>
<table class="table table-borderless">
	<tr>
		<th>ID</th>
		<th>FNAME</th>
		<th>Lname</th>
		<th>Email</th>
		<th>Mobileno</th>
		<th>ADDRESS</th>
		<th>GENDER</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<%
		List<employeebean> list = employeedao.getAllemployee();
		for(employeebean e : list)
		{
	%>
	<tr>

			<td><%= e.getId() %></td>
			<td><%= e.getFname() %></td>
			<td><%= e.getLname() %></td>
			<td><%= e.getEmail() %></td>
			<td><%=e.getMobileno() %></td>
			<td><%=e.getAddress() %></td>
			<td><%= e.getGender() %></td>
			<td><input type ="submit" name ="action"  value ="edit"  class="btn btn-primary"></td>
			<td><input type ="submit" name ="action"  value ="delete" class = "btn btn-danger"></td>
	<% 		
		}
	%>
	</tr>
</table>
</body>
</html>
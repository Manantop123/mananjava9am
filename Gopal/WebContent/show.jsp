<%@page import="com.bean.employee"%>
<%@page import="com.dao.empdao"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>show form</title>
</head>
<body>
<table class ="table table-bordered">
	<tr>
		<th>id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
		
	<%
		List<employee> list = empdao.getallemployee();
		for(employee e : list)
		{
	%>
		<tr>
			<td><%=e.getId() %></td>
			<td><%=e.getFname() %></td>
			<td><%= e.getLname() %></td>
			<form name="myform" method ="post" action="employeecontroller">
			<input type="hidden" name="id" value=<%=e.getId() %>>
			<td><input type="submit" name ="action" value="edit" class="btn btn-primary"></td>
			</form>
			<td><input type="submit" name ="action" value="delete" class="btn btn-danger"></td>
		</tr>
	<% 			
		}
	%>	
	</table>
</body>
</html>
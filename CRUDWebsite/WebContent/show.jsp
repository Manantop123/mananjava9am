<%@page import="com.dao.empdao"%>
<%@page import="com.bean.employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
<table class ="table">
	<tr>
		<th>ID</th>
		<th>FNAME</th>
		<th>EMAIL</th>
		<th>MOBILE</th>
		<th>PASSWORD</th>
		<th>CONFIRMPASSWORD</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<%
		List<employee> list = empdao.getallemployee();
		for(employee e :list)
		{
	%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getFname() %></td>
			<td><%=e.getEmail() %></td>
			<td><%=e.getMobile() %></td>
			<td><%=e.getPassword() %></td>
			<td><%=e.getCpassword() %></td>
			<form name="edit" method="post" action="employeecontroller">
					<td>
					<input type="hidden" name="id" value="<%=e.getId()%>">
					<input type="submit" value="edit" name="action" class="btn btn-primary">
					</td>
			</form>
			<form name="delete" method="post" action="employeecontroller">
					<td>
					<input type="hidden" name="id" value="<%=e.getId()%>">
					<input type="submit" value="delete" name="action" class="btn btn-danger">
					</td>
			</form>
		</tr>
	<% 		
		}
	%>
</table>
</body>
</html>
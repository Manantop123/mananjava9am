<%@page import="com.dao.empdao"%>
<%@page import="com.bean.employee"%>
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
<script type="text/javascript">
	function checkfname()
	{
		var f = document.myform.fname.value;
		
		var reg = /^[a-zA-Z]+$/;
		
		if(f=="")
			{
			document.getElementById("fname").innerHTML="Please enter first name";
			}
		else if(!reg.test(f))
			{
			document.getElementById("fname").innerHTML="enter only character";
			}
		else
			{
			document.getElementById("fname").innerHTML=" ";			
			}
	}
	function checkemail()
	{
		var e = document.myform.email.value;
		
		var reg = /^[a-zA-Z0-9._-]+@[a-zA-Z]+\.[a-zA-Z]{2,4}$/;
		
		if(e=="")
			{
			document.getElementById("email").innerHTML="Please enter email";
			}
		else if(!reg.test(e))
			{
			document.getElementById("email").innerHTML="abc@gmail.com";
			}
		else
			{
			document.getElementById("email").innerHTML=" ";			
			}
	}	
	
	function checkpsw()
	{
		var p = document.myform.psw.value;
		
		var reg = /^(?=.*[a-z])+(?=.*[A-Z])+(?=.*\d)+(?=.*[^a-zA-Z0-9])+(?!.*\s).{8,15}$/;
		
		if(p=="")
			{
			document.getElementById("psw").innerHTML="Please enter password";
			}
		else if(!reg.test(p))
			{
			document.getElementById("psw").innerHTML="ABCabc@3150";
			}
		else
			{
			document.getElementById("psw").innerHTML=" ";			
			}
	}
	  
</script>
</head>
<body>
<%
	employee e1 = (employee)request.getAttribute("emp");
%>
<form name="myform" method="post" action="empcontroller">
	<table align="center">
		<h1 align = "center">update Form</h1>
		<tr>
			<td><input type="hidden" name="id" value="<%=e1.getId()%>"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=e1.getFname() %>" onblur="checkfname();"></td>
			<td><span id="fname"></span></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=e1.getEmail() %>" onblur="checkemail();"></td>
			<td><span id="email"></span></td>
		</tr>
		<tr>
			<td>gender</td>
				<%
					if(e1.getGender().equals("male"))
					{
				%>
					<td>
					<input type="radio" name="gender" value="male" checked="checked">Male				
					<input type="radio" name="gender" value="male">Female				
					</td>
				<% 	
				}
				else if(e1.getGender().equals("female"))
				{					
				%>
				{
					<td>
					<input type="radio" name="gender" value="male" >Male				
					<input type="radio" name="gender" value="male" checked="checked">Female				
					</td>				
				<% 	
				}
				else
				{
				%>
					<td>
					<input type="radio" name="gender" value="male" >Male				
					<input type="radio" name="gender" value="male">Female				
					</td>				
	
				<% 	
				}
				%>
			
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="psw" value="<%=e1.getPassword()%>" onblur="checkpsw();"></td>
			<td><span id="psw"></span></td>
		</tr>
		<tr>
			<td><input type="submit" value="update" name="action"></td>
		</tr>
	</table>
</form>
</body>
</html>
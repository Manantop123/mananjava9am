<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
	<form name ="myform" method = "post" action = "Employeecontroller" align ="center">
	
		<h1> Registarion form </h1>
		
		<table align ="center">
			<tr>
			<td>First Name</td>
			<td><input type = "text" name ="fname"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name ="lname"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type ="text" name ="email"></td>
			</tr>
			<tr>
				<td>mobileno</td>
				<td><input type ="text" name ="mobile"></td>	
			</tr>
			
			<tr>
				<td>Gender</td>
				<td>
				<input type ="radio" name ="gender" value ="male">Male	
				<input type="radio" name ="gender" value ="female">Female
				</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea name ="address" cols=30 rows=5></textarea></td>	
			</tr>
			<tr>
				<td>
				<input type ="submit" name ="action" value ="insert" class = "btn btn-danger" >
				</td>
			</tr>

		</table>
	</form>
</body>
</html>
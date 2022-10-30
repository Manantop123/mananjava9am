<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Form</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script type="text/javascript">
	function checkfname()
	{
		var f = document.myform.fname.value;
		
		var reg = /^[A-za-z]+$/;
		
		//alert("enter name")
		if(f=="")
			{
			document.getElementById("fname").innerHTML="Please enter firstname";
			}
		else if(!reg.test(f))
			{
			document.getElementById("fname").innerHTML="enter only character";
			}
		else
			{
			document.getElementById("fname").innerHTML="";
			}
	}
	function checklname()
	{
		var l = document.myform.lname.value;
		
		var reg = /^[A-Za-z]+$/;
		
		if(l=="")
			{
			document.getElementById("lname").innerHTML="enter lname";
			}
		else if(!reg.test(l))
			{
			document.getElementById("lname").innerHTML="enter only character";
			}
		else
			{
			document.getElementById("lname").innerHTML="";
			}
	}
</script>
</head>
<body>

	<form name ="myform" method ="post" action="employeecontroller" align ="center" >
		<table align ="center">
			<h1>Registration Page</h1>
			<tr>
				<td>First Name</td>
				<td><input type ="text" name ="fname" onblur="checkfname();"></td>
				<td><span id ="fname" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type ="text" name ="lname" onblur="checklname();"></td>
				<td><span id ="lname" style="color:red"></span></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" name="action" class="btn btn-danger"></td>
			</tr>
		</table>
	</form>
</body>
</html>
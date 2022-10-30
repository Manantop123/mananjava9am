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
<script type="text/javascript">
	function checkfname()
	{
		var f = document.myform.fname.value;
		var reg = /^[a-zA-z]+$/;
		
		if(f=="")
			{
			//alert("please enter first name")
			document.getElementById("fname").innerHTML="please enter first name";
			}
		else if(!reg.test(f))
			{
			document.getElementById("fname").innerHTML="enter valid name";
			}
		else
			{
			document.getElementById("fname").innerHTML=" ";
			}
	}
	function checklname()
	{
		var l = document.myform.lname.value;
		var reg =/^[a-zA-Z]+$/ 
		
		if(l=="")
			{
			document.getElementById("lname").innerHTML="please enter Last Name";
			}
		else if(!reg.test(l))
			{
			document.getElementById("lname").innerHTML="enter only charcter";
			}
		else
			{
			document.getElementById("lname").innerHTML=" ";
			}
		
	}
</script>
</head>
<body>
	<form name="myform" method="post" action="employeecontroller">
		<table align="center">
			<h1 align ="center">Registration Form</h1>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" onblur="checkfname();"></td>
				<td><span id="fname" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" onblur="checklname();"></td>
				<td><span id="lname" style="color:red"></span></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="insert" ></td>
			</tr>
		</table>
	</form>
</body>
</html>
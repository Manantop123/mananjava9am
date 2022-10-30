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
<script tye="text/javascript">
	function checkfname()
	{
		var f = document.myform.fname.value;
		
		var reg = /^[a-zA-Z]+$/;
		if(f=="")
			{
			//alert("please enter first name")
			document.getElementById("fname").innerHTML="please enter first name";
			}
		else if(!reg.test(f))
			{
			document.getElementById("fname").innerHTML="enter only charcter";
			}
		else
			{
			document.getElementById("fname").innerHTML=" ";
			}
	}
	function checklname()
	{
		var l = document.myform.lname.value;
		
		var reg = /^[a-zA-Z]+$/;
		if(l=="")
			{
			//alert("please enter first name")
			document.getElementById("lname").innerHTML="please enter last name";
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
	function checkemail()
	{
		var e = document.myform.email.value;
		
		var reg = /^[a-zA-Z0-9.-_]+@[a-zA_Z]+\.[a-zA-Z]{2,3}$/;
		if(e=="")
			{
			//alert("please enter first name")
			document.getElementById("email").innerHTML="please enter email id";
			}
		else if(!reg.test(e))
			{
			document.getElementById("email").innerHTML="enter only charcter like abc@gmail.com'";
			}
		else
			{
			document.getElementById("email").innerHTML=" ";
			}
	}
	function checkmobile()
	{
		var m = document.myform.mobile.value;
		
		var reg = /^\d{10}$/;
		if(m=="")
			{
			//alert("please enter first name")
			document.getElementById("mobile").innerHTML="please enter mobile number in digit";
			}
		else if(!reg.test(m))
			{
			document.getElementById("mobile").innerHTML="enter only numeric";
			}
		else
			{
			document.getElementById("mobile").innerHTML=" ";
			}
	}
	function checkpsw()
	{
		var p = document.myform.psw.value;
		
		var reg = /^(?=.*[a-z])+(?=.*[A-Z])+(?=.*[^a-zA-Z])+(?=.*\d)+(?!.*\s).{8,15}$/;
		if(p=="")
			{
			//alert("please enter first name")
			document.getElementById("psw").innerHTML="please enter password";
			}
		else if(!reg.test(p))
			{
			document.getElementById("psw").innerHTML="enter only charcter like ABCabc@3150 ";
			}
		else
			{
			document.getElementById("psw").innerHTML=" ";
			}
	}
	function checkcpsw()
	{
		var p1= document.myform.psw.value;
		var p2= document.myform.cpsw.value;
		
		if(p2=="")
			{
			document.getElementById("cpsw").innerHTML="please enter password";
			}
		else if(p2!=p1)
			{
			document.getElementById("cpsw").innerHTML="enter confirm password same as password";
			}
		else
			{
			document.getElementById("cpsw").innerHTML="";
			}
	}
	
</script>
</head>
<body>
<form name="myform" method ="post" action="employeecontroller">
	<table align ="center"> 
		<h1 align ="center"> Registration Form</h1>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" onblur="checkfname();"></td>
			<td><span id="fname"></span></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" onblur="checklname();"></td>
			<td><span id="lname"></span></td>
		</tr>
		<tr>
			<td>Email-Id</td>
			<td><input type="text" name="email" onblur="checkemail();"></td>
			<td><span id="email"></span></td>
		</tr>
		<tr>
			<td>Mobile-No</td>
			<td><input type="text" name="mobile" onblur="checkmobile();"></td>
			<td><span id="mobile"></span></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<input type="radio" value="male" name="gender">male
				<input type="radio" value="female" name="gender">female
			</td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="psw" onblur="checkpsw();"></td>
			<td><span id="psw"></span></td>
		</tr>
				<tr>
			<td>CPassword</td>
			<td><input type="password" name="cpsw" onblur="checkcpsw();"></td>
			<td><span id="cpsw"></span></td>
		</tr>
		<tr>
			<td align="center"><input type="submit" name="action" value="insert"></td>
		</tr>
	</table>
</form>
</body>
</html>
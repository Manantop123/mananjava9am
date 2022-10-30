<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function checkfname()
	{
		var f = document.myform.fname.value;
		var reg = /^[a-zA-Z]+$/;
		
		if(f=="")
			{
			document.getElementById("fname").innerHTML="please enter first name";
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
	function checkemail()
	{
		var e = document.myform.email.value;
		var reg = /^[A-Za-z0-9._-]+@[a-zA-Z]+\.[a-zA-Z]{2,4}$/;
		
		if(e=="")
			{
			document.getElementById("email").innerHTML="please enter valid email";
			}
		else if(!reg.test(e))
			{
			document.getElementById("email").innerHTML="abc@gmail.com";			
			}
		else
			{
			document.getElementById("email").innerHTML="";
			}
	}
	function checkmobile()
	{
		var m = document.myform.mobile.value;
		var reg = /^\d{10}$/;
		
		if(m=="")
			{
			document.getElementById("mobile").innerHTML="enter mobile number";
			}
		else if(!reg.test(m))
			{
			document.getElementById("mobile").innerHTML="in digit";			
			}
		else
			{
			document.getElementById("mobile").innerHTML="";
			}
	}
	function checkpsw()
	{
		var p = document.myform.psw.value;
		var reg = /^(?=.*\d)+(?=.*[a-z])+(?=.*[A-Z])+(?=.*[^a-zA-Z0-9])+(?!.*\s).{8,15}$/;
		
		if(p=="")
			{
			document.getElementById("psw").innerHTML="enter only psw";
			}
		else if(!reg.test(p))
			{
			document.getElementById("psw").innerHTML="ABCabc@123";			
			}
		else
			{
			document.getElementById("psw").innerHTML="";
			}
	}
	function checkcpsw()
	{
		var cp = document.myform.cpsw.value;
		var p = document.myform.psw.value;
		
		if(cp=="")
			{
			document.getElementById("cpsw").innerHTML="enter only psw";
			}
		else if(cp!=p)
			{
			document.getElementById("cpsw").innerHTML="password same as confirm password";			
			}
		else
			{
			document.getElementById("cpsw").innerHTML="";
			}
	}
</script>
</head>
<body>
<form name="myform" method="post" action="empcontroller">
	<table align="center">
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" onblur="checkfname();"></td>
			<td><span id="fname"></span></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<input type="radio" name="gender" value="male">male
				<input type="radio" name="gender" value="female">female
			</td>
		</tr>
		<tr>
			<td>Email-Id</td>
			<td><input type="text" name="email" onblur="checkemail();"></td>
			<td><span id="email"></span></td>
		</tr>
		<tr>
			<td>Mobile No</td>
			<td><input type="text" name="mobile" onblur="checkmobile();"></td>
			<td><span id="mobile"></span></td>
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
			<td><input type="submit" value="insert" name="action"></td>
		</tr>
	</table>
</form>
</body>
</html>
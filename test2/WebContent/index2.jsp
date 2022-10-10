<%-- page tag --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
<!-- CSS only -->
<link rel ="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script type ="text/javascript">
	
		function checkfname()
		{
			var f = document.myform.fname.value;
			
			var reg = /^[a-zA-Z]+$/
			if (f=="")
				{
				//alert ("please ennter name")
				document.getElementById("fname").innerHTML="please enter name";
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
		function checklname()
		{
			var l = document.myform.lname.value;
			var reg = /^[a-zA-Z]+$/
			if(l=="")
				{
				document.getElementById("lname").innerHTML = "enter name";
				}
			else if(!reg.test(l))
				{
				document.getElementById("lname").innerHTML="enter only character"
				}
			else
				{
				document.getElementById("lname").innerHTML="";
				}
		}
		function checkemail()
		{
			var e=document.myform.email.value;
			var reg = /^[a-zA-Z0-9._-]+@[a-zA-Z]+\.[a-zA-z]{2,4}$/;
 
			if(e=="")
				{
				document.getElementById("email").innerHTML="please enter email";
				}
			else if(!reg.test(e))
				{
				document.getElementById("email").innerHTML="enter valid email like abd123@gmail.com";
				}
			else
				{
				document.getElementById("email").innerHTML=" ";
				}
		}
		function checknumber()
		{
			var n = document.myform.mobileno.value;
			
			var reg = /^\d{10}$/;
			if(n=="")
				{
				document.getElementById("mobileno").innerHTML="enter mobileno";
				}
			else if(!reg.test(n))
				{
				document.getElementById("mobileno").innerHTML="enter valid mobile no";
				}
			else
				{
				document.getElementById("mobileno").innerHTML=" ";
				}
		}
		function checkpsw()
		{
			var p = document.myform.psw.value;
			
			var reg = /^(?=.*\d)+(?=.*[A-Z])+(?=.*[a-z])+(?=.*[^A-Za-z0-9])+(?!.*\s).{8,15}$/;
			
			if(p == "")
				{
				document.getElementById("psw").innerHTML="enter psw";
				}
			else if(!reg.test(p))
				{
				document.getElementById("psw").innerHTML="enter valid psw use like min 8 and max 15 must be use like A-Za-z0-9!@#$%";
				}
			else
				{
				document.getElementById("psw").innerHTML=" ";
				}
		}
		function checkcpsw()
		{
			var p1 = document.myform.psw.value;
			var p2 = document.myform.cpsw.value;
			
			if(p2=="")
				{
				document.getElementById("cpsw").innerHTML="please enter confirmpsw";
				}
			else if(p1!=p2)
				{
				document.getElementById("cpsw").innerHTML="psw not matched";
				}
			else
				{
				document.getElementById("cpsw").innerHTML=" ";
				}
		}
	 
</script>
</head>
<body>
<form name = "myform" method = "post" action ="EmployeeController">
	<h1 align ="center"> Registration Form </h1>
	<table align ="center">
		<tr>
			<td>First Name</td>
			<td><input type ="text" name ="fname" onblur="checkfname();"></td>
			<td><span id="fname" style="color:red" ></span></td>	
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type = "text" name ="lname" onblur="checklname();"></td>
			<td><span id="lname" style="color:red"></span></td>
		
		</tr>
		<tr>
			<td>Email</td>
			<td><input type ="text" name ="email" onblur="checkemail();"></td>
			<td><span id ="email"></span></td>
		</tr>
		<tr>
			<td>Mobileno</td>
			<td><input type ="text" name ="mobileno" onblur="checknumber();"></td>
			<td><span id ="mobileno"></span></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type ="Password" name = "psw" onblur="checkpsw();"></td>
			<td><span id="psw"></span></td>
		</tr>	
		<tr>
			<td>CPassword</td>
			<td><input type ="Password" name = "cpsw" onblur="checkcpsw();"></td>
			<td><span id ="cpsw"></span></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type ="radio" name = "gender">Male</td>
			<td><input type ="radio" name = "gender">Female</td>
		</tr>	
		<tr>
			<td>Address</td>
			<td><textarea name="address" rows=5 cols=30></textarea></td>
		</tr>
		<tr>
			<td>Education qualification</td>
			<td>
				<input type ="checkbox" name ="edu">10th
				<input type ="checkbox" name="edu">12th
				<input type ="checkbox" name ="edu">BCA
			</td>
		</tr>
		<tr>
			<td>Hobbies</td>
			<td>
				<select name ="hobbies">
				<option>cricket</option>
				<option>Football</option>
				<option>Hockey</option>
				<option>basketball</option>
				<option>kabbadi</option>
				</select>
			</td>
		</tr>	
		<!--  
		<tr>
		<td>
			<h4>Add marksheet</h4>
			10th<input type ="file" value ="marksheet"><br>
		    12th<input type ="file" value ="marksheet"></td>
		</tr>
		-->
		<tr>
			<td>
			<input type ="submit" value ="registration" name = "action" class = "btn btn-danger">
			</td>
		</tr>
		</table>
		</form>
</body>
</html>
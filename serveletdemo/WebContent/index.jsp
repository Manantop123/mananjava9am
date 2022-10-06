<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel ="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<%-- there are three types tags in jsp 
	
	1)scriplet tag
	
	<% %>
	
	2)directive tag
	
	<%@ %>
	
	3)regular expression tag

	<%= %>

--%>

<script type = "text/javascript">
	
	function checkfname()
		{
		var f = document.myform.fname.value;
		var reg = /^[A-Za-z]+$/;
		if(f =="")
			{
			//alert("please enter firstname")
			document.getElementById("fname").innerHTML="Enter firstname";
			}
		else if(!reg.test(f))
			{
			document.getElementById("fname").innerHTML = "Enter CorrectName";
			}
		else 
			{
			document.getElementById("fname").innerHTML ="";
			}
		}
	function checklname()
	{
		var l = document.myform.lname.value;
		var reg = /^[a-zA-z]+$/;
		if(l=="")
			{
			//alert("please enter lname")
			document.getElementById("lname").innerHTML="Enter LastName";
			}
		else if(!reg.test(l))
			{
			document.getElementById("lname").innerHTML="enter Correctname";
			}
		else
			{
			document.getElementById("lname").innerHTML="";
			}
	}
	function checkemail()
	{
		var e = document.myform.email.value;
		var reg = /^[a-zA-Z0-9._-]+@[a-zA-Z]\.+[a-zA-z]{2,4}$/;
		
		if(e=="")
			{
			//alert("enter email")
			document.getElementById("email").innerHTML="please enter email Address";
			}
		else if(reg.test(e))
			{
			document.getElementById("email").innerHTML="abc123-_@gmail.com";
			}
		else
			{
			document.getElementById("email").innerHTML = " ";
			}
	}
	function checknumber()
	{
		var n=document.myform.mobileno.value;
		var reg = /^\d{11}$/;
		if(n=="")
			{
			//alert("enter mobile number")
			document.getElementById("mobileno").innerHTML="enter valid mobile number";
			}
		else if(reg.test(n))
			{
			document.getElementById("mobileno").innerHTML="enter 10 digit mobile number";
			}
		else
			{
			document.getElementById("mobileno").innerHTML=" ";
			}
	}
	function checkpsw()
	{
		var p=document.myform.psw.value;
		var reg=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA_Z0-9])(?!.*\s).{8,15}$/
		
		if(p=="")
			{
			document.getElementById("psw").innerHTML="enter password";
			}
		else if(!reg.test(p))
			{
			document.getElementById("psw").innerHTML="use psw like 0-9a-zA-Z@#$!&* except dont use space";
			}
		else
			{
			document.getElementById("psw").innerHTML=" ";
			}
	}
	function checkcpsw()
	{
		var p1=document.myform.psw.value;
		var p2=document.myform.cpsw.value;
		if(p2=="")
			{
			document.getElementById("cpsw").innerHTML="enter confirm password";
			}
		else if(p1!=p2)
			{
			document.getElementById("cpsw").innerHTML="correct psaaword";
			}
		else
		{
			document.getElementById("cpsw").innerHTML=" ";
		}			
		
	}
</script>
</head>
<body>
	<form name ="myform" method ="post" action="Employeecontroller">
		<h1 align ="center"> Student Registration Form</h1>
		<br>
		<table align ="center">
			<tr>
				<td>First Name</td>
				<td><input type ="text" name = "fname" onblur="checkfname();"></td>
				<td><span id ="fname" style = "color:red"></span></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type ="text" name ="lname" onblur="checklname();"></td>
				<td><span id ="lname" style ="color:red"></span></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type ="text" name ="email" onblur="checkemail();"></td>
				<td><span id="email" style ="color:red""></span></td>
			</tr>
			<tr>
				<td>Mobile No</td>
				<td><input type ="text" Name ="mobileno" onblur="checknumber();"></td>
				<td><span id ="mobileno" style ="color:red"></span></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type =Password" name ="psw" onblur ="checkpsw();"></td>
				<td><span id = "psw" style = "color:red"></span></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type ="text" Name ="cpsw" onblur="checkcpsw();"></td>
				<td><span id ="cpsw" style="color:red"></span></td>	
				
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type ="radio" name ="gender" value="male">male</td>
				<td><input type ="radio" name ="gender" value ="female">female</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea name ="address" rows ="5" cols ="20"></textarea></td>
			</tr>
			<tr>
				<td>Education Qualification</td>
				<td>
				<select name = "Education">
					<option>10th</option>
					<option>12th</option>
					<option>Bechlor</option>
					<option>Master</option>
					<option>PHD</option>
				</select>
			</tr>
			<tr>
				<td>Hobby</td>
				<td>
					<input type ="checkbox" name ="hobby">cricket
					<input type ="checkbox" name ="hobby">Football
					<input type ="checkbox" name ="hobby">Kabbadi
				</td>
			</tr>
			<tr>
				<td><input type ="submit" value ="registration" name ="action" class="btn btn-danger"></td>
			</tr>
		</table>
	</form>
	</body>
</html>
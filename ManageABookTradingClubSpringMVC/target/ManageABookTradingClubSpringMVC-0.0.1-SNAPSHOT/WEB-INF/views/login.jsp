<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
input{
	width: 70%;
	box-sizing: border-box;
	border: 2px solid #ccc;
	border-radius: 4px;
	font-size: 11px;
	background-color: white;
	padding: 12px 10px 12px 10px;
	text-align: center;
	margin-left: 50px
	
}
h1{
	font-size: 30px;
	text-align: center;
	
}
form{
	width: 20%;
	border: 2px solid #ccc;
	border-radius: 5px;
	margin: auto;
	padding: 20px 20px 20px 20px;
	margin-top: 100px;
	background-color: #f2f2f2
}


</style>
</head>
<body>
	<script type="text/javascript">
		${message}
	</script>
	<form action="loginSuccess" method="post" >
		<h1>Login</h1>
		<input type="text" name="username" id="username" onmouseover="checkValidate()" placeholder="User name.." ><br>
		<label id="usernamela" style="color: red; margin-left: 50px;"></label><br>
		<input type="password" name="pass" id="pass" onmouseover="checkValidate()" placeholder="Password..."><br>
		<label id="passla" style="color: red; margin-left: 50px;"></label><br>
		<input id="login" type='submit' value='Login' disabled="disabled" onmouseover="checkValidate()">
		<label id=""></label><br><a href="register">register</a>
	</form>

	<script type="text/javascript">
		function checkValidate() {
			var name = document.getElementById("username").value;
			document.getElementById("usernamela").innerHTML = (name == "") ? "Username is missing !!!": "";

			var pass = document.getElementById("pass").value;
			document.getElementById("passla").innerHTML = (pass == "") ? "Pass is missing !!!": "";
			
			document.getElementById("login").disabled = (pass == ""||name == "") ? "disabled": "";
		}
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<script type="text/javascript">
		${message}
	</script>
	<form action="mainpage" method="post">
		<label>User name:</label><br> <input type="text" name="username"
			id="username" onmouseover="checkValidate()"> <label
			id="usernamela" style="color: red"></label><br> <label>Password:</label><br>
		<input type="password" name="pass" id="pass" onmouseover="checkValidate()">
		<label id="passla" style="color: red"></label> <br>
		<br><label id="login"></label><a href="register">register</a>
	</form>

	<script type="text/javascript">
		function checkValidate() {
			var name = document.getElementById("username").value;
			document.getElementById("usernamela").innerHTML = (name == "") ? "username is missing": "";

			var pass = document.getElementById("pass").value;
			document.getElementById("passla").innerHTML = (pass == "") ? "pass is missing": "";
			
			document.getElementById("login").innerHTML = (pass == ""||name == "") ? "<input type='submit' value='Login' disabled='disabled' onmouseover='checkValidate()''>"
					: "<input type='submit' value='Login'onmouseover='checkValidate()''>";
		}
	</script>
</body>
</html>
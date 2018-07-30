<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
input[type=text],input[type=password],input[type=submit],input[type=email]{
	width: 70%;
	box-sizing: border-box;
	border: 2px solid #ccc;
	border-radius: 4px;
	font-size: 11px;
	background-color: white;
	padding: 12px 10px 12px 10px;
	text-align: center;
	margin-left: 65px;
	
}
h1{
	font-size: 30px;
	text-align: center;
	
}
form{
	width: 30%;
	border: 2px solid #ccc;
	border-radius: 5px;
	margin: auto;
	padding: 20px 20px 20px 20px;
	margin-top: 100px;
	background-color: #f2f2f2
}
select {
	border: 2px solid #ccc;
	border-radius: 5px;
}
</style>
</head>
<body>
<script type="text/javascript">
${message}
</script>
<form action="form">
<h1>Register</h1>
<input type="text" name="username" id="username" placeholder="User name..." required="required" ><br><br>
<input type="password" name="pass" id="pass" placeholder="Password..." required="required"><br>
<label style="margin-left: 65px">Showpass?</label><input id="checkBox" type="checkbox" onclick="change()">
<br><br>
<label style="margin-left: 65px">Gender:</label>
<select id="gender" name="gender">
	<option value="Male">Male</option>
	<option value="Female">Female</option>
	<option value="Other">Other</option>
</select>
<br><br>
<input type="text" name="name" id="name" placeholder="Your name..."><br><br>
<input type="email" name="email" id="email" placeholder="Your email..."><br><br>
<input type="text" name="phone" id="phone" placeholder="Your phone number..."><br><br>
<input type="submit" name="register" id="register" value="Register" ><br>
<a href="login">Login</a>

</form>
<label id="aa"> </label>
<script type="text/javascript">
	function change(){
		var a = document.getElementById("checkBox").checked;
		(a)?document.getElementById("pass").type = "text":document.getElementById("pass").type = "password";
		
	}
</script>
</body>
</html>
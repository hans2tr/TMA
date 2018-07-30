<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" content="width=device-width, initial-scale=1.0">
<title>Information</title>
<style type="text/css">
input[type=text],input[type=password],input[type=submit],input[type=button],input[type=email]{
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
a{
		text-decoration: none;
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
	padding: 10px 10px 10px 10px;
	margin-top: 19px;
	background-color: #f2f2f2
}
label {
	margin-left: 65px;
}
.menu {
		width: 50%;
		margin: auto;
		border: 2px solid #ccc;
		border-radius: 5px;
}
ul {
		display: inline-block;
		margin-left: 60px;
}
li {
		display: inline-block;
		margin-right: 65px;
		margin-left: -27px;
}
input[type=button]{
	display: inline-block;
}
input[type=submit],input[type=button]{
	width: 20%;
	margin-left: 50px;
}
input[type=button]:hover, input[type=submit]:hover{
	background-color: gray;
}
select {
	border: 2px solid #ccc;
	border-radius: 5px;
}

</style>
</head>
<body>

<div style="position: sticky;top: 0;">
	<form id="menu" style="background-color: #f2f2f2">
		<ul>
			<li><a href="home">Home</a></li>
			<li id="a" onmouseover="test()"><a href="">Type</a></li>
			<li>Hello! <a href="infoForm">${sessionScope.username}</a><a href="logout" style="margin-left: 15px">logout</a><input type="hidden" name="${account.username}"></li>
		</ul>
	</form>
</div>
<form:form id="form" action="update" commandName="account">
<h1>Your information</h1>
<label >User name:</label><br>
<input type="text" name="username"  id="username" placeholder="User name..." required="required" disabled="disabled" value="${userInfo.account.username}"><br><br>
<label>Pass:</label><br>
<input type="password" name="pass" id="pass" placeholder="Password..." required="required" disabled="disabled" value="${userInfo.account.password}"><br>
<label style="margin-left: 65px">Showpass?</label><input id="checkBox" type="checkbox" onclick="change()">
<br><br>
<label style="margin-left: 65px">Gender:</label>
<input type="text" name="gender" id="gender" placeholder="gender..." disabled="disabled" value="${userInfo.gender}">
<br><br>
<label>Your name:</label><br>
<input type="text" name="name" id="name" placeholder="Your name..." disabled="disabled" value="${userInfo.name}"><br><br>
<label>Email:</label><br>
<input type="email" name="email" id="email" placeholder="Your email..." disabled="disabled" value="${userInfo.email}"><br><br>
<label>Phone:</label><br>
<input type="text" name="phone" id="phone" placeholder="Your phone number..." disabled="disabled" value="${userInfo.phonenumber}"><br><br>
<input type ='submit' id='update' name='update' value='update' disabled="disabled">
<input type="button" name="Edit" id="edit" value="Edit" onclick="editt()">
<input id="buttonAdd" type="button" value="Add Book" onclick="showAddBook()">
</form:form>
<div id="showAdd"> </div>
<script type="text/javascript">
	function change(){
		var a = document.getElementById("checkBox").checked;
		(a)?document.getElementById("pass").type = "text":document.getElementById("pass").type = "password";
		
	}
	function editt(){
		
		document.getElementById("username").disabled = "";
		document.getElementById("pass").disabled = "";
		document.getElementById("gender").disabled = "";
		document.getElementById("name").disabled = "";
		document.getElementById("email").disabled = "";
		document.getElementById("phone").disabled = "";
		document.getElementById("edit").disabled = "disabled";
		document.getElementById("update").disabled = "";
	}
	function showAddBook(){
		var a = "<form action='inform'>"
			+"<h1>Add book</h1>"
			+"<label>Name:</label><br>"
			+"<input type='text' name='name' id='name'  required='required' value=''>"
			+"<br><br>"
			+"<label>Type:</label>"
			+"<select id='select' onclick='otherr()'>"
			+"<option value='Male'>Male</option>"
			+"<option value='Female'>Female</option>"
			+"<option value='Other'>Other</option>"
			+"</select><br>"
			+"<label>Other:</label><br>"
			+"<input type='text' name='type' id='type' required='required' disabled='disabled'><br><br>"
			+"<input type='submit' name='add' id='add' value='Add'>"
			+"<input id='buttonClose' name='buttonClose' type='button' value='Close' onclick='removeShowAddBook()'>"
			+"</form>";
		document.getElementById("showAdd").innerHTML = a;
		
	}
	function removeShowAddBook(){
		document.getElementById("showAdd").innerHTML = " ";
	}
	function otherr(){
		var a = document.getElementById("select").value;
		document.getElementById("type").disabled = (a=="Other")?"":"disabled";
	}
</script>
</body>
</html>
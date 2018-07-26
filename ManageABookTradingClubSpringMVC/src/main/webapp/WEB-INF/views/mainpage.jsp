<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage A Book Trading Club</title>

<style type="text/css">
	li {
		display: inline-block;
		margin-right: 40px;
		margin-left: -27px;
}
	a{
		text-decoration: none;
	}
	form {
		width: 50%;
		margin: auto;
		border: 2px solid #ccc;
		border-radius: 5px;
}
	div.productform{
		width: 50%;
		margin: auto;
		border: 2px solid #ccc;
		border-radius: 5px;
	}
	ul {
		display: inline-block;
		margin-left: 60px;
}

button {
	width: 50%;
	box-sizing: border-box;
	border: 2px solid #ccc;
	border-radius: 4px;
	font-size: 11px;
	background-color: white;
	padding: 5px 5px 5px 5px;
	text-align: center;
	margin-left: 70px
}

</style>
</head>
<body>
<div style="position: sticky;top: 0;">
	<form style="background-color: #f2f2f2">
		<ul>
			<li><a href="home">Home</a></li>
			<li id="a" onclick="test()"><a href="">Type</a></li>
			<li>Hello! <a href="infor">${sessionScope.username} </a><a href="logout" style="margin-left: 15px">logout</a></li>
		</ul>
	</form>
</div>
<br><br>
<div>
	<form action="" id="single">
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="http://quantri.vuthu.edu.vn/UploadImages/thdungnghia/admin/books1_onhi.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by:  Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham  Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by:  Dang Hai </li>
		<li><button>Trade</button></li>
	</ul>
	<ul style="border: 2px solid #ccc;border-radius: 5px; width: 20%">
		<li style="margin: auto; margin-top: 5px"> <img alt="where my img?" src="https://www.w3schools.com/images/w3schools_green.jpg" width="150px" height="150px"> </li><br>
		<li>Name: Baruto </li>
		<li>Posted by: Pham  Hai </li>
		<li><button>Trade</button></li>
	</ul>
	
	</form>
</div>
<br><br><label id="bb" onmouseout="testa()"></label>
</body>
<script type="text/javascript">
	function test(){
		var a = document.getElementById("a").onmouseover;
		document.getElementById("bb").innerHTML = a;
	}
	function testa(){
		document.getElementById("bb").innerHTML = "";
	}
</script>
</html>
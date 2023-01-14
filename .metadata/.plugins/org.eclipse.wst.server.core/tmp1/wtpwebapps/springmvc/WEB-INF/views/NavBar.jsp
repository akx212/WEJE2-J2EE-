<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NavBar</title>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
        $(document).ready(function()) {
            $('ul').toggleClass('show')
        }
</script>
<style>
* {
	padding: 0;
	margin: 0;
	text-decoration: none;
	list-style: none;
}

body {
	font-family: 'Times New Roman', Times, serif;
	background: url(./city-g0380c3175_1280.jpg) no-repeat;
	background-size: cover;
	height: calc(100vh - 80px);
}

nav {
	height: 80px;
	width: 100%;
	background-color: aqua;
}

nav ul {
	float: right;
	margin-right: 400px;
}

nav li {
	display: inline-block;
	margin: 0 8px;
	line-height: 80px;
}

nav a {
	color: rgb(0, 0, 0);
	font-size: 18px;
	text-transform: uppercase;
	border: 2px solid transparent;
	padding: 7px 10px;
	border-radius: 3px;
}

a.active, a:hover {
	border: 1px solid white;
	transition: .5s;
}

@media ( max-width :1048px) {
	nav ul {
		margin-right: 20px;
	}
	nav a {
		font-size: 17px;
	}
}

@media ( max-width :909px) {
	nav ul {
		position: fixed;
		width: 100%;
		height: 100vh;
		background: #2f3640;
		top: 80px;
		left: -100%;
		text-align: center;
		transition: all .5s;
	}
	nav ul {
		display: block;
		margin: 50px 0;
		line-height: 30px;
	}
	nav a {
		font-size: 20px;
	}
	a.active, a:hover {
		bottom: none;
		color: #3498db;
	}
	nav ul.show {
		left: 0;
	}
}
</style>
</head>
<body>

	<nav>
		<label for="" class="logo"></label>
		<ul>
			<li><a class="active" href="./home">Home</a></li>
			<li><a href="./search">Search</a></li>
			<li><a href="./remove">Remove</a></li>
			<li><a href="./update">Update</a></li>
			<li><a href="./add">Add</a></li>
			<li><a href="./logout">Logout</a></li>
		</ul>
	</nav>
	
</body>
</html>
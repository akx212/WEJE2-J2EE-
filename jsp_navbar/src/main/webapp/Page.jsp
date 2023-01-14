<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NavBar</title>
</head>

<style>
nav {
	background-color: lightblue;
	display: flex;
	justify-content: center;
	align-items: center;
}
nav a {
	color: white;
	text-decoration: none;
	font-size: 18px;
	margin: 0 20px;
}
nav ul {
	list-style: none;
}
</style>
<body>
	<nav>
		<ul style="display: flex;">
			<li><a href="/home">Home</a></li>
			<li><a href="/search">Search</a></li>
			<li><a href="/remove">Remove</a></li>
			<li><a href="/update">Update</a></li>
			<li><a href="/add">Add</a></li>
			<li><a href="/admin">Admin</a></li>
		</ul>
	</nav>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center><h2>Welcome to Monster World!!</h2></center>
	<h3 > hii <%= request.getParameter("username") %> welcome to my WORLD.</h3>
	<p>This is your profile section.</p>
	
	<br>
	<a href="login.jsp"><button type="button" class="btn btn-warning">LOGOUT</button></a>

</body>
</html>
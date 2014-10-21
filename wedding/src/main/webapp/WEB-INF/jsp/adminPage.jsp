<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<h2>Welcome, <b><%= request.getAttribute("username") %></b></h2>
		<a href="/wedding/invitation/home">Go to home page.</a>
	</body>
</html>
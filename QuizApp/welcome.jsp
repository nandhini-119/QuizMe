<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="ani2.css">
<title>welcome</title>
<style type="text/css">
body{
font-size: 30px;
}
</style>
</head>
<body bgcolor="skyblue ">
<div align="center">
	<%
   		if(session.getAttribute("username")==null)
        {
            response.sendRedirect("login.jsp");
        }
  	%>
<b>Welcome </b><b>${username}</b><br><br>
 <a href="quiz.html"><b>Start Quiz</b></a><br><br>

<form action="Logout">
	<input type="submit" value="LOGOUT"><br>
</form>
</div>
</body>
</html>
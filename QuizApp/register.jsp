<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>
</head>
<body bgcolor="orange">
<center>
<h1 text-align:"center"><b>USER REGISTRATION</b></h1>
<div align ="center">
<form  action="Registration"  method="get">  
<b>USERNAME</b> <input type="text" name="uname" required="required"/><br/> <br>  
<b>PASSWORD</b> <input type="password" name="pass" required="required" /><br/><br>
<b>FIRSTNAME</b><input type="text" name="fname" required="required" /><br/><br>
<b>LASTNAME</b> <input type="text" name="lname"  required="required" /><br/><br>
<b>ADDRESS</b>  <input type="text" name="addr"  required="required"/><br/> <br>
<b>CONTACT</b>  <input type="text" name="contact" required="required" /><br/> <br>    
<input type="submit" value="REGISTER"/> <br><br> 
</form>
</div> 
</center>
<center>

<center>
<form action="Logout">
	<a href="login.jsp">Already have an Account</a>
</form>
</center>
</body>
</html>
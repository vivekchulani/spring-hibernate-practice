<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Registration:

<form action="/SpringMVCProject/registerSubmit" method="post">

First Name: <input type="text" name="fname"/>
Last Name: <input type="text" name="lname"/>
Email: <input type="text" name="email"/>
Username: <input type="text" name="username"/>
Password: <input type="password" name="password"/>
<input type="submit"/>

</form>

</body>
</html>
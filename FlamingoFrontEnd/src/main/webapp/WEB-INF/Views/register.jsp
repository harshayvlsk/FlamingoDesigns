<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Registration page<br><br>

<form:form action="register" method="post">
Userid : <input type="text" name="userid"><br><br>

Name : <input type="text" name="userName"><br><br>

Password : <input type="password" name="password"><br><br>

mail : <input type="email"><br><br>

contact : <input type="text" name="contact"><br><br>

Address : <input type="text" name="address"><br><br>

<input type="submit" value="Register">
<input type="reset" value="Reset">
</form:form>
</body>
</html>
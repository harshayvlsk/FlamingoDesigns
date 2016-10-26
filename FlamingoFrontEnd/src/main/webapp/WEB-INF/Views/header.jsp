<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
     </ul>
      
      <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty Success}">
       <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> login</a></li>
        <li><a href="Register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
        </c:if>
        </ul>
        
      <ul class="nav navbar-nav navbar-right">  
        <c:if test="${ not empty Success}">
        <li><a href="Login"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-cart"></span> AddCart</a></li>
        </c:if>
      </ul>
        </div>
        </nav>
</body>
</html>
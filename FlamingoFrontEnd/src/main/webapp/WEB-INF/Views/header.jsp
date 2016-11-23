<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.nav>li>a{
    font-size:14px;
 padding:4px;   
}
</style>
</head>
<body>
	<div class="header-middle"><!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-md-1" style="margin-left:4%">
                    <div class="logo">
                        <a href="#"></a>
                      </div>
                </div>
                <div class="col-md-11" >
                    <div class="shop-menu pull-right">
                        <ul class="nav navbar-nav">
                             <li ><a href="home" class="activeMenu">Home</a></li>
                    <li ><a href="aboutus" >How It Works</a></li>
                    <li ><a href="contact" >Contact us</a></li>
                    <li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Categories <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">suppliers</a></li>
					<li><a href="#">category</a></li>
					<li><a href="#">springform</a></li>
				</ul></li>
                   <ul class="nav navbar-nav navbar-right">
			<c:if test="${not empty successlogin}">
				<li><a href="#">my cart <span
						class="glyphicon glyphicon-shopping-cart"></span></a></li>
				<li><a href="home">Logout <span
						class="glyphicon glyphicon-log-out"></span></a></li>
			</c:if>
			<c:if test="${empty successlogin}">
				<li><a href="registerHere">Signup <span
						class="glyphicon glyphicon-user"></span></a></li>
				<li><a href="login">Login <span
						class="glyphicon glyphicon-log-in"></span></a></li>
			</c:if>
		</ul>
  
                        </ul>
                    </div>
                </div>
               
            </div>
            <hr>
            <div class="row">
                <p style="font-family: initial; font-size: 50px; color:#C39B28; letter-spacing: 3px;">Flamingo Designs</p>
            </div>
        </div>
    </div>    </body>
</html>

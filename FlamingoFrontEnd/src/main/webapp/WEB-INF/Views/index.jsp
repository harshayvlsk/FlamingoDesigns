<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title></title>
<h2></h2>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
</style>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<c:if test="${carousel}">
	
		<jsp:include page="Carousel.jsp"></jsp:include>
		
		<jsp:include page="thumbnail.jsp"></jsp:include>

	</c:if>
	
	<c:if test="${log}">
		<jsp:include page="login.jsp"></jsp:include>
	</c:if>
	<c:if test="${About}">
		<jsp:include page="aboutus.jsp"></jsp:include>
	</c:if>
	<c:if test="${Contact}">
		<jsp:include page="contact.jsp"></jsp:include>
	</c:if>
	
	${failedlogin}
	<c:if test="${reg}">
		<jsp:include page="register.jsp"></jsp:include>
	</c:if>
	${successlogin}
	<c:if test="${successlogin}">
		<jsp:include page="Carousel.jsp"></jsp:include>
	</c:if> 
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
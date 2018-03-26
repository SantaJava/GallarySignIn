<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>title</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--  material design bootstrap stylesheet -->
<link rel="stylesheet"
   href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.5/css/mdb.min.css" />
<!-- font awesome -->
<script defer
   src="https://use.fontawesome.com/releases/v5.0.8/js/solid.js"
   integrity="sha384-+Ga2s7YBbhOD6nie0DzrZpJes+b2K1xkpKxTFFcx59QmVPaSA8c7pycsNaFwUK6l"
   crossorigin="anonymous"></script>
<script defer
   src="https://use.fontawesome.com/releases/v5.0.8/js/fontawesome.js"
   integrity="sha384-7ox8Q2yzO/uWircfojVuCQOZl+ZZBg2D2J5nkpLqzH1HY0C1dHlTKIbpRz/LG23c"
   crossorigin="anonymous"></script>

<!-- jQuery -->
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   
<link href="bower_components/lightbox2/src/css/lightbox.css"
   rel="stylesheet">
<script src="bower_components/lightbox2/src/js/lightbox.js"></script>
<!--JSTL-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
   $(function(){
	//lightbox 크기 
   });
</script>


</head>

<body>
	<%@ include file = "header.jsp" %>
	<h3>MEXICO _ THE LAND OF NACHOS AND MUCHACHO</h3><br>
	<img src = "images/background.jpg" width = 50%/><br>
	<hr/>
	
	<c:forEach var = "file" items = "${list}">
	<a href="images/${file}" data-lightbox="roadtrip" > <img
		src="images/${file}" width="100">
	</a>
	</c:forEach>

	<br>
	<a href="logout">Logout</a>
</body>
</html>
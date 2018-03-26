<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<!-- material design bootstrap -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	$(function() {

	});
</script>

</head>
<body>
	<form method="post">
		<label for="userid"> 아이디 : </label> <input type="text" name="userId"
			id="userid" value="hong1"><br> <label for="userpwd">
			암 &nbsp; 호 : </label> <input type="password" name="password" id="userpwd"
			value="1234"><br> <input type="submit" value="로그인">
		<br> <br>
		<c:if test="${not empty error}"> <!-- 있는지 없는지 확인.-->
			${error}
		</c:if>
	</form>
</body>
</html>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.5/js/mdb.min.js"></script>

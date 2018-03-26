<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.Member"%>

<%
	Member member = (Member) session.getAttribute("user"); //united.
%>

<style>
#header {
	background: #efefef;
	text-align: right;
	padding: 5px 20px;
	text-align: right;
}
</style>


	<div id="header">
		<i class="fa fa-user"></i>
		${user.userId}
		<i class="fa fa-sign-out-alt"></i> <a href="logout">logout</a>
			<!-- EL 표현방식. -->
			

	</div>
	


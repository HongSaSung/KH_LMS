<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<header>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="./login.do">LMS</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">과정</a></li>
				<li><a href="#">강의</a></li>
				<li><a href="#">학원공지</a></li>
				<li><a href="#">출결</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li>
					<span>${sessionScope.name} 님 환영합니다! [sessionScope.auth]</span>
				</li>
<%-- 				<c:if test="${sessionScope.auth eq 'A'}"> --%>
					<li><a href="./memberList.do"><span class="glyphicon glyphicon-user"></span>MemberList</a></li>
<%-- 				</c:if> --%>
<%-- 				<c:if test="${sessionScope.auth eq 'U'}"> --%>
					<li><a href="./myPage.do"><span class="glyphicon glyphicon-user"></span>MyPage</a></li>
<%-- 				</c:if> --%>
				<li><a href="./logout.do"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
			</ul>
		</div>
	</nav>
</header>
</html>
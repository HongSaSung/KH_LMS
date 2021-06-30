<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./js/LMS_SignUp.js"></script>
</head>
<body>
<%@include file="header.jsp" %>
<div>
	<form action="./signUp.do" method="post" onsubmit="signupCheck()">
		<input type="text" id="name" name="name" placeholder="이름"><br>
		<input type="text" id="userid" name="userid" placeholder="아이디"><input type="button" value="중복확인" onclick="idDupleChk()"><br>
		<input type="password" id="password" name="password" placeholder="비밀번호"><br>
		<input type="text" id="email" name="email" placeholder="이메일"><br>
		<input type="text" id="address" name="address" placeholder="주소"><br>
		<input type="text" id="phone" name="phone" placeholder="전화번호"><br>
		<input type="submit" value="SignUp">
		<input type="reset" value="Cancel">
	</form>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
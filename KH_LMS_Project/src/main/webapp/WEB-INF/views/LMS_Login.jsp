<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LMS_Login</title>
<script type="text/javascript">
	function loginCheck() {
		var userid = document.getElementById("userid").value;
		var pw = document.getElementById("password").value;
		if(user == "") {
			alert("아이디를 입력해주세요.");
		}else if(password == "") {
			alert("비밀번호를 입력해주세요.");
		}
	}
	
</script>
</head>
<body>
<div>
	<form action="./login.do" method="post" onsubmit="return loginCheck()">
		<input type="text" id="userid" name="userid">
		<input type="password" id="password" name="password">
		<input type="submit" value="LOGIN">
		<input type="button" value="회원가입" onclick="javascript:location.href='./signupForm.do'">
	</form>
</div>
</body>
</html>
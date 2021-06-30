<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복검사</title>
<script type="text/javascript">
function idConfirm() {
	var idConfirm = document.getElementById("idConfirm").value;
	location.href="./idDupleChk.do?id" // 찾아보기
	
}
</script>
</head>
<body>
<div>
	<input type="text" id="idChk" value="${userid}">&nbsp;&nbsp;
	<c:if test="${isc}">
	<div>중복되는 아이디입니다.</div>
	</c:if>
	<c:if test="${isc ne true}">
	<div>사용 가능한 아이디입니다.</div>
	</c:if>
	<input type="button" value="확인" onclick="idConfirm()">
	
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세조회</title>
<script type="text/javascript">
	function userDel() {
		confirm("정말 탈퇴하시겠습니까?");
	}
</script>
</head>
<body>
<%@include file="header.jsp" %>
<a href="./userDel.do" onclick="userDel()" id="del">회원탈퇴</a>
<table class="table table-hover">
	<thead> <!-- foreach로 작성하고 회원 권한 변경하는 버튼? select? 만들어야 함 -->
		<tr>
			<th>USERID</th>
			<th>이름</th>
			<th>E-Mail</th>
			<th>주소</th>
			<th>전화번호</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
			<tr>
				<td>${userOne.userid}</td>
				<td>${userOne.name}</td>
				<td>${userOne.email}</td>
				<td>${userOne.address}</td>
				<td>${userOne.phone}</td>
				<td>${userOne.regdate}</td>
			</tr>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="2">
				<input type="button" value="수정" onclick="modifyUser()"><!-- 비밀번호 인증하도록 만들어야 함 -->
				<input type="button" value="돌아가기" onclick="javascript:history.back(-1)">
			</td>
		</tr>
	</tfoot>
</table>
</body>
</html>
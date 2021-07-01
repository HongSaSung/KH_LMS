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
		location.href="./deleteMember.do";
	}
	function modifyUser() {
		console.log("비밀번호확인");
		var pw = prompt("비밀번호를 입력해주세요.");
		if(pw == null) {
			return;
		}
		$.ajax({
			url : "./passOk.do",
			method : "get",
			async : false,
			dataType : "text",
			data : {"pw":pw},
			success : function (msg) {
				console.log(msg);
				if(msg == 'true'){
					location.href="./updateForm.do";
				} else {
					alert("비밀번호가 틀립니다.");
					return;
				}
			},
			error : function () {
				alert("잘못된 요청입니다.");
				return;
			}
		});
		
	}
</script>
</head>
<body>
<%@include file="header.jsp" %>
<span onclick="userDel()" id="del">회원탈퇴</span>
	<table class="table table-hover">
		<tbody>
			<tr>
				<th>USERID</th>
				<td>${userOne.userid}</td>
			<tr>
				<th>이름</th>
				<td>${userOne.name}</td>
			</tr>
			<tr>
				<th>E-Mail</th>
				<td>${userOne.email}</td>
			</tr>
			<tr>
				<th>주소</th>
				<td>${userOne.address}</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${userOne.phone}</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${userOne.regdate}</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<input type="button" onclick="modifyUser()" value="수정" ><!-- 비밀번호 인증하도록 만들어야 함 -->
					<input type="button" value="돌아가기" onclick="javascript:history.back(-1)">
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>
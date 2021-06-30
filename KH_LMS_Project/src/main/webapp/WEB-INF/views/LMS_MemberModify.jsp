<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세조회</title>
</head>
<body>
<%@include file="header.jsp" %>

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
				<td>
					<input type="text" id="email">
				</td>
			</tr>
			<tr>
				<th>주소</th>
				<td>
					<input type="text" id="email">
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<input type="text" id="email">
				</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${userOne.regdate}</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<input type="button" value="수정완료"><!-- 비밀번호 인증하도록 만들어야 함 -->
					<input type="button" value="돌아가기" onclick="javascript:history.back(-1)">
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>
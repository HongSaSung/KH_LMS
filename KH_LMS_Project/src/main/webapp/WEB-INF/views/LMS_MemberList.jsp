<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
</head>
<body>
<%@include file="header.jsp" %>
<table class="table table-hover">
	<thead>
		<tr>
			<th>USERID</th>
			<th>이름</th>
			<th>회원권한</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="mem" items="${memList}">
			<tr>
				<td><a href="./memberDetail.do?userid=${mem.userid}">${mem.userid}</a></td>
				<td>${mem.name}</td>
				<td>${mem.auth}</td>
				<td>${mem.regdate}</td>
				<td>
					<input  type="button" value="강사등록">
					<input type="button" value="탈퇴"><!-- 관리자일 때 회원탈퇴 처리시키는 버튼 -->
				</td>
				<td></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>
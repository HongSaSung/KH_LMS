<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강사 상세조회</title>
</head>
<body>
<%@include file="header.jsp" %>
<table class="table table-hover">
	<thead> <!-- foreach로 작성 -->
		<tr>
			<th>강사번호</th>
			<th>강의명</th><!-- 담당하고 있는 강의명 -->
			<th>이름</th>
			<th>USERID</th>
			<th>비밀번호</th>
			<th>E-Mail</th>
			<th>주소</th>
			<th>전화번호</th>
			<th>회원권한</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
	</tbody>
</table>
</body>
</html>
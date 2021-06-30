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
	<thead> <!-- foreach로 작성하고 회원 권한 변경하는 버튼? select? 만들어야 함 -->
		<tr>
			<th>회원번호</th>
			<th>이름</th>
			<th>USERID</th>
			<th>회원권한</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
<%-- 		<c:forEach var="member" items="" > --%>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>
					<input type="button" value="탈퇴"><!-- 관리자일 때 회원탈퇴 처리시키는 버튼 -->
					<input  type="button" value="강사등록">
				</td>
				<td></td>
			</tr>
<%-- 		</c:forEach> --%>
	</tbody>
</table>
</body>
</html>
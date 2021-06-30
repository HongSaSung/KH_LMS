<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>\
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강사 전체조회</title>
</head>
<body>
<table class="table table-hover">
	<thead> <!-- foreach로 작성 -->
		<tr>
			<th>강사번호</th>
			<th>이름</th>
			<th>USERID</th>
			<th>회원권한</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
<%-- 		<c:forEach> --%>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
<%-- 		</c:forEach> --%>
	</tbody>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강생 전체조회</title>
</head>
<body>
<%@include file="header.jsp" %>
<table class="table table-hover">
	<thead> 
		<tr>
			<th>회원번호</th>
			<th>과정명</th> <!-- 소속된 과정의 이름 -->
			<th>이름</th>
			<th>USERID</th>
			<th>회원권한</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody><!-- foreach로 작성 -->
<%-- 		<c:forEach var="member" items="" > --%>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td>
					<input type="button" value="출결" onclick="javascript:location.href='./studentAttend.do'">
				</td>
			</tr>
<%-- 		</c:forEach> --%>
	</tbody>
</table>
</body>
</html>
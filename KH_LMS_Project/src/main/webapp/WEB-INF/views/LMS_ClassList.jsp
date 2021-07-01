<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정 전체조회</title>
</head>
<body>
<%@include file="header.jsp" %>
<table class="table table-hover">
	<thead>
		<tr>
			<th>과정번호</th>
			<th>과정명</th>
<!-- 			<th>시작일</th> -->
<!-- 			<th>종료일</th> -->
		</tr>
	</thead>
	<tbody>
	<c:forEach var="cl" items="${clList}" varStatus="vs">
		<tr>
			<td>${cl.cl_seq}</td>
			<td><a href="./classDetail.do?cl_seq=${cl.cl_seq}">${cl.cl_title}</a></td>
<!-- 			<td></td> -->
<!-- 			<td></td> -->
		</tr>
	</c:forEach>
	</tbody>
	<tfoot>
		<tr>
			<td>
				<input type="button" value="과정개설" onclick="javascript:location.href='./classInsert.do'">
			</td>
		</tr>
	</tfoot>
</table>
</body>
</html>
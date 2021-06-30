<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정 상세조회</title>
</head>
<body>
과정번호
과정명
과정 상세내용
등록된 강의번호
등록된 강의명 당당 강사(ex> 강사 : OOO)
<%@include file="header.jsp" %>
<table class="table table-hover">
	<thead>
		<tr>
			<th>과정번호</th>
			<th>과정명</th>
			<th>내용</th>
			<th>시작일</th>
			<th>종료일</th>
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
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="2">
				<input type="button" value="수정" onclick="courseModify()">
				<input type="button" value="돌아가기" onclick="javascript:history.back(-1)"><br>
				<input type="button" class="btn btn-primary btn-block btn-lg" value="강의리스트" onclick="showLecture()">
			</td>
		</tr>
	</tfoot>
</table>
</body>
</html>
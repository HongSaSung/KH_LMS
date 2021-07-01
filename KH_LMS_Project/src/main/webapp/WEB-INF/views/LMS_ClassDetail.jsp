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
		<tbody>
			<tr>
				<th>과정명</th>
				<td>${cl_Detail.cl_title}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${cl_Detail.cl_desc}</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<input type="button" value="수정"  onclick="javascript:location.href='./classModify.do?cl_seq=${cl_Detail.cl_seq}'">
					<input type="button" value="돌아가기" onclick="javascript:history.back(-1)"><br>
	<!-- 				<input type="button" class="glyphicon glyphicon-plus" value="강의추가" onclick="lectureAdd()"> -->
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>
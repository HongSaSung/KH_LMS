<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정 상세내용 수정</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="./classModifyChk.do" method="post">
	<input type="hidden" name="cl_seq" value="${cl_Detail.cl_seq}">
	<table class="table table-hover">
		<tbody>
			<tr>
				<th>과정명</th>
				<td><input type="text" value="${cl_Detail.cl_title}" name="cl_title" readonly="readonly"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<textarea rows="10" cols="50" name="cl_desc"></textarea>
				</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정확인">
					<input type="button" value="돌아가기" onclick="javascript:history.back(-1)"><br>
				</td>
			</tr>
		</tfoot>
	</table>
</form>
</body>
</html>
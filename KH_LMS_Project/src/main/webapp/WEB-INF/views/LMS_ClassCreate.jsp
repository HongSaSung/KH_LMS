<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정개설</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="" method="post" onsubmit="return classAdd()">
	<table class="tabla table-hover">
		<tbody>
			<tr>
				<th>과정명</th>
				<td>
					<input type="text" id="courseN" name="courseN">
				</td>
			</tr>
			<tr>
				<th>과정설명</th>
				<td>
					<textarea rows="10" cols="50"></textarea>
				</td>
			</tr>
		</tbody>
	</table>
	<input type="submit" value="등록">
	<input type="button" value="Reset">
	<span class="glyphicon glyphicon-plus" onclick="teacherAdd()"></span>강사추가
</form>
</body>
</html>
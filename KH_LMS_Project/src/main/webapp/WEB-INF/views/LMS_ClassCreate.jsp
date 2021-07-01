<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정개설</title>
<style type="text/css">
	
</style>
</head>
<body>
<%@include file="header.jsp" %>
<form action="./insertClass.do" method="post" onsubmit="return classAdd()">
	<table class="tabla table-hover">
		<tbody>
			<tr>
				<th>과정명</th>
				<td>
					<input type="text" id="courseN" name="cl_title">
				</td>
			</tr>
			<tr>
				<th>과정설명</th>
				<td>
					<textarea rows="10" cols="50" name="cl_desc"></textarea>
				</td>
			</tr>
		</tbody>
	</table>
	<div id="btns">
		<input type="submit" class="btn btn-success" value="등록">
		<input type="button" class="btn btn-danger" value="Reset">
	</div>
</form>
</body>
</html>
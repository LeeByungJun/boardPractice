<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>지석쓰 게시판 연습</title>
</head>
<body>
<style>
.cjsTd{

border: solid black;

}
</style>
	<%@ include file = "/WEB-INF/views/A3.Common/header.jsp" %>
	<br>
	<br>
	<br>
<center>
<table class="maintable">
<tr>
<td class="cjsTd">글번호</td>
<td class="cjsTd">제목</td>
<td class="cjsTd">작성자</td>
<td class="cjsTd">작성일</td>
<td class="cjsTd">조회수</td>
</tr>
<tbody>

</tbody>
</table>
</center> 

${cjaboard}


</body>
</html>
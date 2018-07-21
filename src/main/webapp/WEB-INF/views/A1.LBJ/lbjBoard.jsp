<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>병준이 게시판</title>
<style type="text/css">
	.lbjTd{
		text-align:center;
	}
</style>
</head>
<body>
	<%@ include file = "/WEB-INF/views/A3.Common/header.jsp" %>
	<div class="container">
		<h2>병준이 게시판 연습</h2>
		<table class="table table-hover">
			<tr><td class="lbjTd">글번호</td><td class="lbjTd">제목</td><td class="lbjTd">작성자</td><td class="lbjTd">작성일</td><td class="lbjTd">조회수</td></tr>
			<c:forEach var="board" items="${lbjBoard}">
				<tr>
					<td class="lbjTd">${board.lbj_bno}</td>
					<td class="lbjTd">${board.lbj_btitle}</td>
					<td class="lbjTd">${board.lbj_bwriter}</td>
					<td class="lbjTd">${board.lbj_bdate}</td>
					<td class="lbjTd">${board.lbj_bview}</td>
				</tr>
			</c:forEach>
			<!-- <tr><td class="lbjTd">1</td><td class="lbjTd">사하라사막에 대하여</td><td class="lbjTd">낙타</td><td class="lbjTd">2018/07/20</td><td class="lbjTd">31</td></tr>
			<tr><td class="lbjTd">2</td><td class="lbjTd">고비사막에 대하여</td><td class="lbjTd">낙타</td><td class="lbjTd">2018/07/21</td><td class="lbjTd">15</td></tr>
		 --></table>
	</div>
</body>
</html>
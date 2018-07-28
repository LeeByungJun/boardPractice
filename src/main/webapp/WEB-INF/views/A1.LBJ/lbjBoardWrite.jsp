<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>병준이 게시판 글쓰기</title>
<style type="text/css">
	.lbjTd{
		text-align:center;
	}
</style>
</head>
<body>
	<%@ include file = "/WEB-INF/views/A3.Common/header.jsp" %>
	<script type="text/javascript">
		function fnBack(){
			window.history.go(-1);
		}
	</script>
	<div class="container">
		<h2>게시글 쓰기</h2>
		<form action="lbjBoardWrite" method="get" enctype="multipart/form-data">
			<table class="table table-hover">
				<tr><td class="lbjTd">제목</td><td><input type="text" name="lbj_btitle" style="width:67%;"></td></tr>
				<tr><td class="lbjTd">첨부파일</td><td><input type="file" name="file"></td></tr>
				<tr><td class="lbjTd">내용</td><td><textarea name="lbj_bcontent" rows=10 cols=90></textarea></td></tr>
				<tr><td colspan="2" style="text-align:center;">
					<input type="submit" class="btn btn-success" value="작성하기">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" class="btn btn-danger" onclick="fnBack();" value="돌아가기">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
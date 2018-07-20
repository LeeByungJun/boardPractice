<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더</title>
	<script type="text/javascript" src="/fuck/resources/common/js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="/fuck/resources/common/css/bootstrap.min.css">
	<script type="text/javascript">
		function goLbjBoard(){
			location.href="lbjGoBoard";
		}
	</script>
</head>
<body>
	<div style="text-align:center;">
	<h1> 게시판 만들어보기  </h1>
	<button class="btn btn-info" onclick="">지석햄 게시판</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<button class="btn btn-success" onclick="goLbjBoard();">병주니 게시판</button>
	</div>
</body>
</html>
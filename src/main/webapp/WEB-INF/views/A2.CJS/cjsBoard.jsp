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
<td class="cjsTd">내용</td>
<td class="cjsTd">조회수</td>
<td class="cjsTd">첨부파일여부</td>
<td class="cjsTd">작성일</td>
</tr>
<tbody>
<c:forEach items="${cjaboard}" var="i" begin="">
<tr>
<td>${i.cjs_bno}</td>
<td>${i.cjs_btitle}</td>
<td>${i.cjs_bwriter}</td>
<td>${i.cjs_bcontent}</td>
<td>${i.cjs_bview}</td>
<td>
<c:if test="${i.cjs_bfile eq null}">없음</c:if>
<c:if test="${i.cjs_bfile ne null}">있음.</c:if>
</td>

 
<td>${i.cjs_bdate}</td>
</tr>
</c:forEach>
</tbody>
</table> 
</center> 
<!-- cjs_bno --> 
<!--  cjs_btitle -->
<!-- cjs_bwriter -->
<!-- cjs_bcontent -->
<!-- cjs_bfile=null -->
<!-- cjs_bview=0 -->
<!-- cjs_bdate -->
  
<button>
글쓰기
</button>

</body>
</html>
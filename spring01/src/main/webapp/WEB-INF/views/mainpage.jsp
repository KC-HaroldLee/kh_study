<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>메인페이지</h2>
 <a href="hello">헬로 가기</a>
 <a href="/spring01/hello">헬로 가기(절대경로)</a>
 <a href="${pageContext.request.contextPath}/hello">헬로 가기(절대경로)</a>
</body>
</html>
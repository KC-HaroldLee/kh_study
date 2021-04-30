<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 	입력창에 연결시키는 이름 작성공간 -->

	<label for ="id-input">아이디</label>
	<input id = "id-input" type="text" name="memberId">
	<br>
	<input id = "agree1" type="checkbox" name="agree" id="agree-input">
	<label for ="agree1">동의합니다</label>
	<br>
<!-- 	비추 글자는 태그에 감싸져 있으면 좋다. -->
	<label>
	<input type="checkbox" name="agree" id="agree-input">
	동의합니다
	</label>
</body>
</html>
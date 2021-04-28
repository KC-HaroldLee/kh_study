<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지(memberInsert)</title>
</head>
<body>
<h1>회원가입</h1>
<!-- 	<form action="/study/jsp/memberInsert.kh"> -->
	<form action="/study/jsp/memberInsert.kh">
<!-- 네임을 빼 먹었다 석현아 -->
		아이디 : <input type="text" name="memberId" required> <br><br>
		비밀번호 : <input type="password" name="memberPw" required> <br><br>
		닉네임 : <input type="text" name="memberNick" required><br><br>
		생년월일 : <input type="date" name="memberBirth" required><br><br>
		전화번호 : <input type="tel" name="memberPhone" required><br><br>
		이메일 : <input type="email" name="memberEmail"><br><br>
		<input type = "submit" value ="가입!">
	</form>
</body>
</html>
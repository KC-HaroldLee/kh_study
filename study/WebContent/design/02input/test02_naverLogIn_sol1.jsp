<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#naver-logo {
	font-family: sans-serif;
	font-size: 20px;
	font-weight: bold;
	color: #2db400;
}

#naver-id-input {
font-family: sans-serif;
font-size: 20px;
width : 300px;
padding : 1rem;
margin: 5px;
box-sizing: border-box;
}

#naver-pw-input {
font-family: sans-serif;
font-size: 20px;
width : 300px;
padding : 1rem;
margin: 5px;
box-sizing: border-box;
}

#naver-submit {
font-family: sans-serif;
font-size: 20px;
width : 300px;
padding : 1rem;
color : white;
background-color: #2db400;
border-style:none;
margin: 5px;
}
</style>

</head>
<body>
	<h1 id="naver-logo">NAVER</h1>
	<form action="?" method="post">

		<input id="naver-id-input" type="text" name="memberId" 	placeholder="아이디" required>
		<br>
		<input	id="naver-pw-input" type="password" name="memberPw" placeholder="비밀번호" required>
		<br>
		<input	id="naver-submit" type="submit" value="로그인">

	</form>
</body>
</html>
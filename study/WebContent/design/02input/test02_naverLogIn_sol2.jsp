<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#naver-login{
	/*전체 영역설정을 할 것이다.
	-글꼴
	-폭
	-폭설정기준
	-
	*/
	box-sizing: border-box;
	width: 400px;
	font-family: sans-serif;
	margin-left: auto;
	margin-right: auto;
}


#naver-logo {
	font-size: 60px;
	font-weight: bold;
	color: #2db400;
	text-align: center;
}

#naver-id-input, #naver-pw-input, #naver-submit  {
width : 100%;
font-size: 20px;
padding : 1rem;
margin-bottom : 10px;
box-sizing: border-box;
}

#naver-submit {
color : white;
background-color: #2db400;
border-style:none;
}
</style>

</head>
<body>
<div id ="naver-login">
	<h1 id="naver-logo">NAVER</h1>
	<form action="?" method="post">

		<input id="naver-id-input" type="text" name="memberId" 	placeholder="아이디" required>

		<input	id="naver-pw-input" type="password" name="memberPw" placeholder="비밀번호" required>
	
		<input	id="naver-submit"  type="submit" value="로그인">

	</form>
	</div>
</body>
</html>
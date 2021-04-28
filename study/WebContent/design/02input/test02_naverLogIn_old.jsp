<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here </title>
<style>
.test {
	border-style: solid;
	color: black;
	padding: 15px;
	width: 33%;
	margin : 10px;
}

.button {
	color : white;
	border-color: silver;
	width: 33%;
	background-color: #2DB400;
	padding :10px;
}
</style>

</head>
<body>

<form>
	<img src="../../image/naver_logo.png" width=30%>
	<br>

	<input class="test" type="text" placeholder="아이디">
	<br>

	<input class="test" type="password" placeholder="비밀번호">
	<br>
	<input class="button" type="submit" value="로그인">

</form>
</body>
</html>
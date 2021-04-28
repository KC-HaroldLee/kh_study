<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.coupang-login {
	width: 462px;
	margin-left: auto;
	margin-right: auto;
	text-align:center;
}

 .coupang-login > .logoImg{
   width : 195px;
}
 .coupang-login > form > .input{
 	width : 462px;
 	border-style: solid;
 	border-color: silver;
 	border-width: 1px;
 	padding: 16px 0px 16px 65px; /*시계방향*/
 	margin : 8px 0px; /*상하 좌우*/
 	box-sizing: border-box;  /*기준테두리*/
 	font-size : 14px;
 	font-weight: bolder;
 }
 
 .coupang-login > form > .bgimg{
  	background-position: left; 
  	background-repeat: no-repeat; 
  	background-size: contain; /*이러면 꽉참*/
  	}
 
 .coupang-login > form > .id{
  	background-image:url("https://via.placeholder.com/150?text=MAIL"); 
	}
 .coupang-login > form > .pw{
  	background-image:url("https://via.placeholder.com/150?text=LOCK");
	}


.coupang-login > form > .btn{
	width : 462px;
	font-size :16px;
	padding: 13px;
	font-weight: bolder;
	border-radius: 5px; /*쪼끔 둥글다?*/
	border-width :1px;
	border-bottom-width: 3px;
}

.coupang-login > form > .loginBtn{
background-color: #0074e9;
color: white; 
border-color: #0074e9; /*명도가 자동으로 설정되는군...*/
}

.coupang-login > form > .joinBtn{
background-color: white;
color: #0074e9; 
border-color: silver; 
}

.coupang-login > .copyright{
font-weight: lighter;  /* coupang-login 의 값이 "bold" */
font-size :14px;
}
</style>

</head>
<body>
<br><br>
	<div class="coupang-login">
		<img src="../../image/logo-coupang.png"  class="logoImg" >
		<form action="쿠팡회원로그인서블릿" method="post">

			<input type="text" name="memberId" placeholder="아이디(이메일)" required class = "input id bgimg">
			<input type="password" name="memberPw" placeholder="비밀번호" required class = "input pw bgimg">
			<input type="submit" value="로그인"  class ="btn loginBtn">
			<hr>
			<input type="button" value="회원가입" class = "btn joinBtn">
		</form>
		<p class = "copyright">©Coupang Corp. All rights reserved.</p>

	</div>

</body>
</html>
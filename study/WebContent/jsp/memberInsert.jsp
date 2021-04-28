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
<!--	<form action="/study/jsp/memberInsert.kh" method="get"> -->
	
<!-- 	메소드는 GET! -->
	
<!-- 지금까지 했던 방식은 GET방식이다. 주소의 ?이후에 데이터를 첨부하는 방식, 주소를 이용한 데이터 전달 방식
장점 : 간편하며 다양한 종류의 태그로 쉽게 사용가능. 
단점 : 주소 최대 256바이트까지만 작성이 가능하므로 전송 가능한 데이터 양의 제한이 있다. 
따라서 POST방식! http body를 이용하여 데이터를 전달하는 방식이 쓰인다. -->

<!--  겟방식은 편지지가 필요없는 편지봉투 느낌 단 256바이트로 제한된다. 
POST방식
장점 : 전송양이 무대한대이다. 데이터가 많거나 파일을 보낼때 사용.
단점 : 반드시 Form이 있어야한다. (자바스크립트를 배우면 이야기가 달라진다.)
		전송되는 데이터는 ASCIIcode로 전송된다. (즉 유니코드가 깨진다.) ->따라서 디코딩 작업을 해야한다.
-->
	


<form action="/study/jsp/memberInsert.kh" method="POST"> 
<!-- memberInsertServlet로 가자 -->
	
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
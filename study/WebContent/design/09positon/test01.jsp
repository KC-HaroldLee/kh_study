<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>position 속성다루기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		body {
		height: 50000px;
		}
	
		.a, .b, .c{
			width:150px;
			height:150px;
			border:1px solid black;
			/*position: static; */ /*기본값임*/
			/*position: relative;*/  /*앞태그의 영향을 받아 위치가 결정되지만 약간의 조정이 가능
			-left : 왼쪽으로부터의 간격
			-right, -top, -bottom
			*/
			/*position: absolute;*/ /* 이건 페이지 고정
			z-index : 배치되는 층수*/
			position: fixed; /*말그대로 픽스! 브라우저 화면 기준이네*/
		}
		
		.a{
		background-color: #9AEE6E;
		top:100px;
		left:100px;
		}
		.b{
		background-color: #02A96D;
		top:200px;
		left:200px;
		}
		.c{
		background-color: #8790BE;
		top:300px;
		left:300px;
		}
		
	</style>
	
</head>
<body>
	<!-- 
		영역에 부여되는 Position 속성 이해하기
		- 위치는 크게 2가지 유형으로 정해진다
		1. 연관배치 : 앞태그의 위치가 현재 태그에 영향을 미치는 경우
			= 대부분의 컴포넌트가 여기에 해당됨
			= static, relative (기본값은 static)
			
		2. 고정배치 : 앞태그의 위치와 상관없이 현재 태그의 위치가 정해지는 경우
			= 공지, 광고 등 화면을 덮는 배치가 필요한 경우 사용
			= 상단메뉴들도 여기에 해당
			= absolute, fixed
	 -->
	 
	 <div class="a"></div>
	 <div class="b"></div>
	 <div class="c"></div>
</body>
</html>
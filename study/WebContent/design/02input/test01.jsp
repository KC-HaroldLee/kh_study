<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력창 스타일링 </title>
<style>
/*
	상태선택자
	input:first-child
	input:nth-child
		속성선택자
	input[type ="text"]

	input[name=keyword] <<<이게 낫다.
	input[] 	
	
*/
	.test{
		border-color: green;
		border-style: solid;
		border-width: 5px;
		border-radius: 1px;
		
		/* 여백 스타일 margin(외부여백), padding(내부여백)*/
		padding: 12px  5px;  /*상하먼저 좌우나중*/
		/*padding: 5px 10px 15px, 20px;*/ /*시계 방향*/
		
		/*font-family: 궁서;*/ /*나중에 폰트 첨부하겠지 뭐*/
		
			
		font-size :20px; /*고정값도 가능하구*/
		/*font-size : 2.5 rem;*/ /*(기본텍스트 기준)비율로도 가능하다 - 나중에 수정하기는 좋긴하겠다.*/
		
		
		/* 크기속성
			-width : 폭, px, %지정
			-height : 높이, px로 지정 (%가 안되기도 함)*/
		 width : 250px;
	}
	
</style>
</head>
<body>

<form action="" method="get">
	<input class="test"  type="text" name= "keyword" placeholder="무엇을 찾으세요?">
	<input class="test"  type ="submit" value="검색"> 
</form>


</body>
</html>
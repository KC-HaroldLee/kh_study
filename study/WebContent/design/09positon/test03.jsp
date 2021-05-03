<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
	height : 540000px;
	}
	
	.loading-modal{
	position: fixed;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	background-color: rgba(0,0,0,0.25);
	}
	

	.loading-modal> .loading-icon{
	width :100px;
	height:100px;
	position : fixed;
	top : 50%;
	left : 50%;
	transform: translate(-50%, -50%); /*음.. css3이라 지원하지 않는 브라우저가 있을 수 있다)
	}
	



</style>

</head>
<body>

<a href="http://www.naver.com">결제하기</a>
<a href="http://www.naver.com">취소하기</a>

<div class="loading-modal">
	<img src="/study/image/loading.gif"  class="loading-icon">
</div>
</body>
</html>
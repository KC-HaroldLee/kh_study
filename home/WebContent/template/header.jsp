<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//실제 context path를 구하는 명령
	String root = request.getContextPath();
%>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내가 만든 홈페이지</title>
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/menu.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/layout.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/test.css">
	<style>
		
	</style>
</head>
<body>
	<main>
		<header>
			<h1>홈페이지 1달만에 박살내기</h1>
		</header>
		<nav>
			<!-- 메뉴 -->
			<ul class="menu">
				<li>
					<a href="#">회원 기능</a>
					<ul>
						<li><a href="<%=root%>/member/join.jsp">회원가입</a></li>
						<li><a href="<%=root%>/membre/login.jsp">로그인</a></li>
						<li><a href="<%=root%>/member/logout.kh">로그아웃</a></li>
						<li><a href="<%=root%>/member/myinfo.jsp">내정보 보기</a></li>
						<li><a href="<%=root%>/####">내정보 수정</a></li>
						<li><a href="#">회원 탈퇴</a></li>
						<li><a href="#">회원 조회/검색</a></li>
					</ul>
				</li>
				<li>
					<a href="#">아이템 관리</a>
					<ul>
						<li><a href="<%=root%>/item/itemInsert.jsp">아이템 등록</a></li>
						<li><a href="<%=root%>/item/itemList.jsp">아이템 목록(1)</a></li>
					</ul>
				</li>
				<li>
					<a href="#">상품관리</a>
					<ul>
						<li><a href="#">상품등록</a></li>
						<li><a href="<%=root%>/product/productList.jsp">상품목록</a></li>
						<li><a href="<%=root%>/product/productSearch.jsp">상품검색</a></li>
						<li><a href="#">서브4</a></li>
					</ul>
				</li>
				<li>
					<a href="#">메뉴4</a>
					<ul>
						<li><a href="#">서브1</a></li>
						<li><a href="#">서브2</a></li>
						<li><a href="#">서브3</a></li>
						<li><a href="#">서브4</a></li>
					</ul>
				</li>
			</ul>
		</nav>
		<section>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-600">
	<div class="row">
		<h2>로그인</h2>
	</div>
	
	<form action="login.kh" method="post">
		<div class="row text-left">
			<label>아이디</label>
			<input type="text" name="memberId" required class="form-input form-input-underline">
		</div>
		<div class="row text-left">
			<label>비밀번호</label>
			<input type="password" name="memberPw" required class="form-input form-input-underline">
		</div>
		<div class="row">
			<input type="submit" value="로그인" class="form-btn form-btn-positive">
		</div>
	</form>
	
	<div class="row">
		<h4><a href="#">아이디가 기억나지 않습니다.</a></h4>
	</div>
	<div class="row">
		<h4><a href="#">비밀번호가 기억나지 않습니다.</a></h4>
	</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
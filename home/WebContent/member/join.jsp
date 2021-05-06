<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

 <div class="container-600">
 	<div>
 		<h2>회원가입 페이지</h2>
 	</div>
 	
 	<div class="row">
 	
 	<!-- 절대경로 나중에 강사님 깃가서 확인하기 -->
 	<form action="join.kh" method="post">
 	<div class="row text-left">
 	
 		<div class= "row">
 			<label>아이디</label>
 			<input type="text" name="memberId" required class="form-input form-input form-input-underline"> 
 		</div>
 		
 		<div class="row">
			<label>비밀번호</label>
		<input type="password" name="memberPw" required class="form-input form-input form-input-underline"> 
		</div>
		
 		<div class="row">
 			<label>비밀번호 확인창</label>
 		<input type="password" required class="form-input form-input form-input-underline"><!-- name이 필요 없다. --> 
 		</div>
 		
 		<div class="row">
 		<label>닉네임</label>
 		<input type="text" name="memberNick" required class="form-input form-input form-input-underline"> 
 		</div>
 		
  		<div class="row">
 		<label>생년월일</label>
 		<input type="date" name="memberBirth" required class="form-input form-input form-input-underline"> 
 		</div>		
 		
 		<div class="row">
 			<label>전화번호</label>
 		<input type="tel" name="memberPhone" required class="form-input form-input form-input-underline"> 
 		</div>
 		
 		<div class="row">
 		<label>이메일</label>
 			<input type="text" name="memberEmail" class="form-input form-input form-input-underline"> 
 		</div>
 		
 		<div class="row">
			<!-- 버튼 -->
 			<input type="submit" value="회원가입" class="form-btn form-btn-positive">
 		</div>
 	</form>
 

 </div>


  <jsp:include page="/template/footer.jsp"></jsp:include>
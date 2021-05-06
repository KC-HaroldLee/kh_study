<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>
 <div class="container-600">
 	<div>
 		<h2>상품 등록</h2>
 	</div>
 	
 	<div>
 		<form action="productInsert.kh" method ="post">
 			<div class="row">
 				<label>상품이름</label>
 					<input type="text" name="name" required class="form-input">
 			</div>
			<div class="row">
			 	<label>분류</label><br>
				 	<select name="type">
	 					<option>아이스크림</option>
	 					<option>사탕</option>
	 					<option>과자</option>
	 					<option>주류</option> 					
	 				</select>
			</div>

 			<div class="row">
 				<label>상품가격</label>
 					<input type="text" name="price" required class="form-input">
 			</div>

 			<div class="row">
 				<label>제조일</label>
 					<input type="date" name="made" required class="form-input">
 			</div>
 			
 			<div class="row">
 				<label>만료일</label>
 					<input type="date" name="exprie" required class="form-input">
 			</div>
	
			<div>
				<input type="submit" value="등록!" class="form-btn form-btn-positive">
			</div>
 	
 	</form>
</div>


  <jsp:include page="/template/footer.jsp"></jsp:include>
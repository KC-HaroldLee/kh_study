<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>
			

<div class="container-600">
	<div class="row">
		<h2>아이템 등록</h2>
	</div>
	<form action="itemInsert.kh" method="post">
		<div class="row">
			<label>아이템 이름</label>
			<input type="text" name="itemName"  required class="form-input">
		</div>
		<div class="row">
			<label>아이템 금액</label>
			<input type="text" name="itemPrice"  required class="form-input">
		</div>
		<div class="row">
			<input type="submit" vlaue="등록" class="form-btn form-btn-positive">
		
		</div>
	</form>
	</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
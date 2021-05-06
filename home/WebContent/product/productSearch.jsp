<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:include page="/template/header.jsp"></jsp:include>
 	<div class="contain-600">
 		<div = row>
 			<h2>상품 검색</h2>
 		</div>
 		
 		<div class="text-center">
 			<form action ="/product/productSearch.kh" method ="post">
 				<select name="type">
 					<option>아이스크림</option>
 					<option>사탕</option>
 					<option>과자</option>
 					<option>주류</option> 					
 				</select>
 				<input type="text" name="keyword">
 				<input type="submit"  value="검색!"> 			 
 			</form>
 
 		</div>
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	</div>    
 <jsp:include page="/template/footer.jsp"></jsp:include>
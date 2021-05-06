<%@page import="home.beans.ProductDto"%>
<%@page import="home.beans.ProductDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ProductDao productDao = new ProductDao();
	List<ProductDto> productList = productDao.list(); 
%>

<jsp:include page="/template/header.jsp"></jsp:include>
 
 <div class="container-600">
 	<div>
 		<h2>상품 검색 결과</h2>
 	</div>
 	
 	<div class="row">
 		<table class="table table-border table-hover">
 			<thead>
 				<tr>
 					<th>번호</th>
 					<th>이름</th>
 					<th>분류</th>
 					<th>가격</th>
 					<th>제조일</th>
 					<th>만료일</th>
 				</tr>
 			</thead>
 			<tbody>
 				<%for (ProductDto productDto : productList) {%>
 					<tr>
 						<td><%=productDto.getNo() %></td>
 						<td><%=productDto.getName() %></td>
 						<td><%=productDto.getType()%></td>
 						<td><%=productDto.getPrice()%></td>
 						<td><%=productDto.getMade()%></td>
 						<td><%=productDto.getExpire()%></td> 			
 					</tr>
 				<%} %>
 			</tbody>
			</table>
 	 	</div>
 </div>
  <jsp:include page="/template/footer.jsp"></jsp:include>
    
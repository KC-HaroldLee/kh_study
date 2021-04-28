<%@page import="study.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>  <!-- 	바로 위 두줄은 설정, (디렉티브)라고한다 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp연습 - productList</title>
</head>
<body>

<% %>

 <%-- 	 <스트립트릿(scriptlet) : jsp 페이지를 구성하기 위한 코드를 작성하는 영역 --%>
	<%
	ProductDao productDao = new ProductDao();
	%>
	<%
	List<ProductDto> list = productDao.list();
	%>
<h2>상품목록</h2>
	<table border="1">
		<thead>
			<th>NO</th>
			<th>NAME</th>
			<th>TYPE</th>
			<th>PRICE</th>
			<th>MADE</th>
			<th>EXPIRE</th>
		</thead>

		<%
		for (ProductDto productDto : list) {
		%>
		<tr>
			<td><%= productDto.getNo()%></td> 
<!-- 			(등호는 '라는 값을 찾겠다.라는 뜻) -->
			<td><%= productDto.getName()%></td>
			<td><%= productDto.getType()%></td>
			<td><%= productDto.getPrice()%></td>
			<td><%= productDto.getMade().substring(0, 10)%></td>
			<td><%= productDto.getExpire().substring(0, 10)%></td>
			<%
			}
			%>
		</tr>
	</table>


</body>
</html>
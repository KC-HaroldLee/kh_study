<%@page import="study.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
		//준비 (파라미터 준비)
		int begin, end;
		
		
		try{
			//plan A : 올바른 파라미터 값이 전달 되었을 때
		begin = Integer.parseInt(request.getParameter("begin"));
		end = Integer.parseInt(request.getParameter("end"));
		}
		catch(Exception e){
			//plan B
			begin = 1;
			end =10;
		}
ProductDao productDao = new ProductDao();
List<ProductDto> list = productDao.rank(begin, end); // ??? 이거 어케 해 / 하긴했네
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "http://localhost:8080/study/jsp/productRank.jsp">
<fieldset>
	<legend>범위설정</legend>
		<input type ="number" name ="begin"> 부터
		<input type ="number" name ="end"> 까지
		<input type ="submit" value = "보기">
</fieldset>
</form>
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
			<td><%= productDto.getName()%></td>
			<td><%= productDto.getType()%></td>
			<td><%= productDto.getPrice()%></td>
			<td><%= productDto.getMade()%></td>
			<td><%= productDto.getExpire()%></td>
			<%
			}
			%>
		</tr>





<!--확인 url
http://localhost:8080/study/jsp/productRank.jsp?begin=1&end=3 -->

	</table>
</body>
</html>
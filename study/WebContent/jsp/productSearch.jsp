<%@page import="study.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	//준비

	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");

	//계산
	//=type과 keyword가 둘 다 있으면 검색, 아니면 목록
	//목록 : null일때
	//검색 : null이 아닐때

	ProductDao productDao = new ProductDao();
	List<ProductDto> productList;

	if (type == null || keyword == null) {
		productList = productDao.list(); // 아 그래서 리스트구나
	} else {
		productList = productDao.search(type, keyword);
	}
	//서버사이드렌더링
	%>


	<form action="http://localhost:8080/study/jsp/productSearch.jsp">
		<fieldset>
			<select>
				<option value=name>이름</option>
				<!--  나이스하다.  -->
				<option value=type>상품분류</option>
				<option value=pirce>상품가격</option>
				<option value=made>제조일</option>
				<option value=expire>만료일</option>
			</select> <input type="text" name="keyword"> <input type="submit"
				value="검색">
		</fieldset>


	</form>

	<table border="1" width="600">
		<thead>
			<tr>
				<th>상품번호</th>
				<th>상품명</th>
				<th>상품분류</th>
				<th>판매가</th>
				<th>제조일</th>
				<th>유통기한</th>
			</tr>
		</thead>

		<tbody>
			<%
			for (ProductDto productDto : productList) {
			%>
			<tr>
				<!-- 표현식(Expression) : 화면에 자바값을 출력하기 위한 구문 -->
				<td><%=productDto.getNo()%></td>
				<td>
					<%-- 				<a href="/study/jsp/productDetail.jsp?no=<%=productDto.getNo()%>"> --%>
					<a href="productDetail.jsp?no=<%=productDto.getNo()%>"> <%=productDto.getName()%>
				</a>
				</td>
				<td><%=productDto.getType()%></td>
				<td><%=productDto.getPrice()%></td>
				<td><%=productDto.getMade().substring(0, 10)%></td>
				<td><%=productDto.getExpire().substring(0, 10)%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>
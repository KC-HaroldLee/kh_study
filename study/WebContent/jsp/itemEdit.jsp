<%@page import="study.beans.ItemDto"%>
<%@page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정</title>
</head>
<body>

	<%
	//수정을 하려면 기존 정보를 표시해야하므로 상세 페이지 처럼 "번호를 이용한 조회"작업을 수행해야한다.
	int itemNo= Integer.parseInt(request.getParameter("itemNo"));
	
	ItemDao itemDao = new ItemDao();
	ItemDto itemDto = itemDao.get(itemNo);
	%>


	<h1>상품 수정</h1>

		
<!-- 	<form action="/study/jsp/itemEdit.kh" method="post"> -->
	<form action="itemEdit.kh" method="post">
	
		<input type="hidden" name="itemNo" value="<%=itemDto.getItemNo()%>"> <br><br><!-- 사용자에게 보여줄 필요는 없다 -->
		이름 : <input type="text" name="itemName" value="<%=itemDto.getItemName()%>"> <br><br>
		가격 : <input type="text" name="itemPrice" value="<%=itemDto.getItemPrice()%>"> <br><br>
		
		<input type="submit" value="수정하기">
	
	</form>


</body>
</html>
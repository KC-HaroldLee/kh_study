<%@page import="study.beans.ItemDto"%>
<%@page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>단일조회</title>
</head>
<body>

<% 
	//준비
	int itemNo = Integer.parseInt(request.getParameter("itemNo"));

	//계산
	ItemDao itemDao = new ItemDao();
	ItemDto itemDto = itemDao.get(itemNo);
%>

<!-- 화면출력 HTML -->
<h2>번호 : <%=itemDto.getItemNo() %></h2>
<h2>이름 : <%=itemDto.getItemName() %></h2>
<h2>가격 : <%=itemDto.getItemPrice() %></h2>

<h3><a href="http://localhost:8080/study/jsp/itemDelete.kh?=<%=itemDto.getItemNo() %>">상품삭제하기</a></h3>
<h3><a href="/itemDelete.kh?=<%=itemDto.getItemNo() %>">상품삭제하기</a></h3>
</body>
</html>
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

<h3><a href="/study/jsp/itemEdit.jsp?itemNo=<%=itemNo%>">아이템 수정하기(절대경로)</a></h3>
<h3><a href="itemEdit.jsp?itemNo=<%=itemNo%>">아이템 수정하기(상대경로)</a></h3>

<h3><a href="/study/jsp/itemDelete.kh?itemNo=<%=itemNo%>">아이템 삭제하기(절대경로)</a></h3>
<h3><a href="itemDelete.kh?itemNo=<%=itemNo%>">아이템 삭제하기(상대경로)</a></h3>
</body>
</html>
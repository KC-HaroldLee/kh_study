<%@page import="home.beans.ItemDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	int itemNo = Integer.parseInt(request.getParameter("itemNo"));
	ItemDao itemDao = new ItemDao();
	ItemDto itemDto = itemDao.get(itemNo);
%>
   
<jsp:include page="/template/header.jsp"></jsp:include>
	<div class="container-600">	
		<div class="row">
			<h2>!아이템 상세정보!</h2>
		</div>
		
		
		<div class="row">
			<table class="table table-border">
				<tr>
					<th width="25%">아이템 번호</th>
					<td><%=itemDto.getItemNo() %></td>
				</tr>
				<tr>
					<th>아이템 이름</th>
					<td><%=itemDto.getItemName() %></td>
				</tr>
				<tr>
					<th>아이템 가격</th>
					<td><%=itemDto.getItemPrice() %>?</td>
				</tr>
				
			</table>
		</div>
		<div class="row text-right">
			<tr>
				<td colspan="2">
				<a href="itemList.jsp" class="link-btn">목록</a>
				<a href="itemEdit.jsp?itemNo=<%=itemNo %>" class="link-btn">수정</a>
				<a href="itemDelete.jsp?itemNo=<%=itemNo %>" class="link-btn">삭제</a>
			</tr>
		</div>
		
		
		<div class="row">
		
		</div>

</div>

<jsp:include page="/template/footer.jsp"></jsp:include>
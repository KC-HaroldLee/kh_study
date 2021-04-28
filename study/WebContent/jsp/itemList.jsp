<%@page import="study.beans.ItemDto"%>
<%@page import="java.util.List"%>
<%@page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--     이안에   자바 언어를 넣을 수 있다. -->
<%
ItemDao itemDao = new ItemDao();
List<ItemDto> list = itemDao.list();
%>

<table border="1">
	<thead>
		<tr>
			<th>itemNo</th>
			<th>itemName</th>
			<th>itemPrice</th>
		</tr>0
	</thead>
	<% for(ItemDto itemDto : list) { %>
	<tr>
		<td><%=itemDto.getItemNo() %></td>
		<td>
			<a href="/study/jsp/itemDetail.jsp?itemNo=<%=itemDto.getItemNo()%>">
				<%=itemDto.getItemName() %>
			</a>
		</td>
		<td><%=itemDto.getItemPrice() %></td>
			<% } %>
			
<h4><a href="/study/jsp/itemInsert.jsp">아이템등록1(절대경로)</a></h4>
<h4><a href="itemInsert.jsp">아이템등록1(상대경로)</a></h4>

<h4><a href="/study/jsp/itemInsert2.jsp">아이템등록2(절대경로)</a></h4>
<h4><a href="itemInsert2.jsp">아이템등록2(상대경로)</a></h4>
</table>

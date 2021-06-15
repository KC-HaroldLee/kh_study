<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="itemDto" items="${list}">
	<h2>리스트!</h2>
	<h3>${itemDto.itemName} / ${itemDto.itemPrice}</h3>
</c:forEach>

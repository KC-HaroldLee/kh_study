<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	EL (expression language)
	=표현식을 간편하기 위해 만들기 위한 언어
	=MVC Pattern2에서 값을 쉽게 출력하는 것이 목표
	=${값} 또는 ${식}의 형태로 사용한다.
	=표현식의 대부분의 기능이 표현 언어로 대체 가능하다.
	
	=(주의) 스크립트릿의 변수를 출력할 수 없다.
 --%>

<% //연습장
	int a = 10;
	int b = 20;
%>

<!-- 하나 뺴고 잘 되면서 문자열 비교에서 좀 후하다 -->
<h1><%=a %>, ${b}</h1><!-- 스크립트릿변수를 출력할 수 없다. -->
<h1><%=1+1 %>|${1+1}</h1> 
<!-- 이건 버그. 무시하자 -->
<h1><%="java".equals("python") %> | ${"java".equals("python")} | ${"java"=="python"}| ${"java" eq "java"}</h1> <!-- 문자열이 ==으로 가능 -->



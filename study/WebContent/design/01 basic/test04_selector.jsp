<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선택자 배우기</title>
	<style>
	
		/* 선택자 라는 것은 : 디자인을 적용시킬 대상을 선택하기 위한 문법이다.
		아래에서는 'h1'이겠다.
		태그 선택자 : 태그명을 이용하여 페이지 내의 모든 대상을 선택하는 방법 (위험)
		상태 선택자 : 대상을 특정하기 위한 상태를 이용하여 선택하는 방법
			ex) h1 : first-child, last-child, nth-child 등
		*/
	
		/*h1 :nth-child(1){
		color:red;
		background-color: yellow;
		}*/
		
		/*속성 선택자 : 태그 속성을 이용하여 선택하는 방법.... 그 중 아이디 선택자가 있는데
		그 중 !아이디 선택자 : 모든 태그에는 id라는 속성을 부여할 수 있으며 id는 페이지 내에서 유일해야한다.
		페이지 내에서 딱 하나만 선택하고 싶을 때 사용 딱하나니까 로고 같은 곳에 쓰인다*/
		
		#target{
		/*h1#target{*/
		/*h1[id=target]{*/ /*아이디 선택자는 위처럼 표현이 가능하다*/
		color:red;
		background-color: yellow;
		}
		
		/*클래스 선택자
		모든 태그에는 class라는 속성을 부여할 수 있으며, 중복하여 부여가 가능하고, 여러 개 부여가능
		페이지 내에서 원하는 그룹을 만들어 선택하고 싶을 때 사용.
		*/
		
		
		.test{ /*이러면 결과는 같지만 다른 태그에도 적용할 수 있게 되기까지 한다.
		/*h1.test{}*/ 
		/*h1[class="test"]{*/ /*얘는 이렇게 줄여진다.*/
			color:red;
			background-color: yellow;
		}
		
	</style>
</head>
<body>

	<h1 id="target">Hello Design</h1>
	<h1>Hello Design</h1>
	<h1 class="test">Hello Design</h1>
	<h1 class="test">Hello Design</h1>
	<h1>Hello Design</h1>
	
	
</body>
</html>
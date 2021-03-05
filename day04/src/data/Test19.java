package data;
	import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		//문자열
		//문자열 : 문자 여러개가 모여있는 것. 하나도 되고 없는 것도 된다.
		// = 크기를 알 수 없다.
		// = 좋은 점 : 저장공간을 효율적으로 쓸 수 있다. 만드는 김에 여러기능 추가
		// = 안 좋은 점 : 만드는데 오래걸린다.
		
		// 이러한 형태의 데이터를 "참조형" 데이터라고 부른다(Reference type) 
		// 참조형은 글씨도 까맣다.
		// byte, long, double처럼 이미 정해진 기초 형태를 "원시형"이라 부른다.
		
		
		String a = "Hello"; // 이건 10바이트
		System.out.println(a);
		System.out.println(a.length()); //length는 글자수를 세준다.
		System.out.println(a.charAt(0)); // 첫번째(0) 글씨를 보여주세요. // 자의 눈금이라고 생각하면 좋다.
		
		//문자열 특징 : 연산이 될까? 더하기는 예외로 된다?
		System.out.println(a + " goodbye"); // 대신 무조건 문자열이 된다.
		System.out.println(a + 100);//이것도 무조건 문자열이 된다. 그러니까 (아래)
		
		String b = "100"; 
		System.out.println(b + 100); //결과값은 100100인데 이건 문자열이다.
		
		String c = "100";
		int d = 100;
		//int e = (int)c + d; // 이경우 에러가 뜬다.
		//System.out.println(e);
	}

}

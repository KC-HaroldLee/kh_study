package api.lang.object;

//import java.lang.Object; 오오~

public class Test01 {
	public static void main(String[] args) {
		
		//자바 표준API에 있는 java.lang.Object를 사용해 보는 것
	
	//1. 객체생성
	Object a = new Object();
	Object b = new Object();
	
	//2. 주어진 기능을 써보자.
	//=hashCode() 일련번호 반환(동일함을 판단하는 기준)
	//주소는 아니다.
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	//3. toString
	//=
	System.out.println(a.toString());
	System.out.println(b.toString());
}
}

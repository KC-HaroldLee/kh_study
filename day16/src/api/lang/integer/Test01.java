package api.lang.integer;

public class Test01 {
	public static void main(String[] args) {
		
	//java.lang.Integer 클래서
	//1 100이라는 값을 가지는 객체를 생성
	
	Integer a = new Integer(100);
	Integer b = new Integer("100");
	
	System.out.println("a = " + a.toString());
	System.out.println("b = " + b.toString());
	
	//a 와 b는 똑같아요?(동등) 완전 똑같아요(동일)
	System.out.println(a==b); //동일한가?
	System.out.println(a.equals(b));//동등한가? 참조형은 이걸로 한다.
}
}

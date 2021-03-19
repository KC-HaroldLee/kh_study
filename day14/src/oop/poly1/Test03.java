package oop.poly1;

public class Test03 {
	public static void main(String[] args) {
		//배열을 이요하여 갤21s 5개와 아이폰12 5개를 보관.
		//정적 타입으로 보면 갤 21, 앞12배열이 배열이 각각 필요하다.
		//동적 타입으로 보면 phone 배열 10칸만 있으면 가능하다.
		
		Phone [] p = new Phone[10];
		
		p[0] = new Galaxy21S();
		p[1] = new Iphone12();
		//...//
		
	
	
	}
}

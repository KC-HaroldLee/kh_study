package oop.poly1;

public class Test02 {
	public static void main(String[] args) {
		
		//정적타입
		Galaxy21S a = new Galaxy21S();
		Iphone12 b = new Iphone12();
		
		//동적타입
		Phone c = new Galaxy21S();
		Phone d = new Iphone12();
		
		c.call();
		d.call();
		
		
	}
}

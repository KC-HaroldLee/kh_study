package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		//객체를 만들었숩니다. 다행! 상위클래스 안 만듦
		Pororo p = new Pororo();
		
		Tayo t = new Tayo();
		
		
		p.set("뽀로로 인형", 50000);
		t.set("타요 장난감", 100000);
		p.result();
		t.result();
		
		p.hello();
		p.nag();
		t.hello();
		t.drive();
		
		
	}
}

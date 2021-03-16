package oop.basic5;

public class Test01 {
	public static void main(String[] args) {
		
		Student a = new Student();
		Student b = new Student();
		
		a.set("홍길동", 70);
		b.set("임꺽정", 50);
		
		a.result();
		b.result();	
	}
}

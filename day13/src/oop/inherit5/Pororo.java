package oop.inherit5;

//생성자가 있는 상속 클래스 상속
//상위(슈퍼)클래스의 생성 클래스를 맞춰야한다.
public class Pororo extends Product{

	//?!?!?!
	
	public Pororo(String name) {
		//슈퍼클래스의 생성자에 값전달
		super(name);
	}
	
	public Pororo(String name, int price) {
	super(name, price);
	}
}

package oop.inherit5;
//상위 클래스에 생성자를 만들 수 있나?
public class Product {
	
	//멤버 변수
	protected String name;
	protected int price;
	
	//생성자
	public Product(String name) {
		this.name = name;
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void hello() {
		System.out.println("안녕!");		
	}
}

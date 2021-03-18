package oop.inherit3;

public class Product {
	// 멤버변수
	// 상위 클래스에는 접근제한의 선택지가 하나 늘어난다.
	// -private : 자식클래스 조차 접근 불가능하다!!
	// protected : 자식클래스는 접근 가능하다!!
	protected String name;
	protected int price;

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void set(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//메소드...
	public void hello() {
		System.out.println("안녕!");
	}

	// 출려@?>#!@?#!@#
	public void result() {
		System.out.println(name + "은 " + price + "원");
	}

}

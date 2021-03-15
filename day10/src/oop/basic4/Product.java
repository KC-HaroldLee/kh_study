package oop.basic4;

public class Product {

	//멤버 변수
	String code, name, sort;
	int price;

	void set(String code, String name, String sort, int price) {
		this.code = code;
		this.name = name;
		this.sort = sort;
		this.price = price;
	}

	void result() {
		System.out.println(this.code);
		System.out.println(this.name);
		System.out.println(this.sort);
		System.out.println(this.price);
	}

}

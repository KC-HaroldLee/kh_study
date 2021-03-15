package oop.basic3;

public class Olympic {

	String name;
	String sports;
	int gold;
	int silver;
	int bronze;

	String type1;
	String type2;
	String type3;

	// 멤버메소드
	
	// set 메소드
	// 5개의 데이터를 받아서 코드를 실행하는 메소드
	void set(String a, String b, int c, int d, int e) {
	this.name = a;
	this.sports = b;
	this.gold = c;
	this.silver = d; 
	this.bronze = e;
	}
	
	// result 메소드
	void result() {
		System.out.println(this.name);
		System.out.println(this.sports);
		System.out.println(this.gold);
		System.out.println(this.silver);
		System.out.println(this.bronze);
	}
}

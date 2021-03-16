package opp.basic7;

public class Drink {
	// 멤버변수
	String name;
	String type;
	int price;
	boolean eventOn;

	// 멤버 메소드
	void input(String name, String type, int price, boolean eventOn) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.eventOn = eventOn;
	}

	// 출력 메소드
	void result() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		if (eventOn == true) {
			System.out.println("행사중");
		} else {
			System.out.println("행사아님");
		}
	}
}

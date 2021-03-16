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
		System.out.println("<메뉴정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("종류 : " + this.type);
		System.out.println("가격 : " + this.price);
		if (this.eventOn) {
			int dcPrice = this.price*(80/100);
			System.out.println("행사중");
		} else {
			System.out.println("행사아님");
		}
	}
}

/*
 * 
 * 
 * 	if (this.eventOn) {
			int dcPrice = this.price*(80/100);
			System.out.println("가격 " + dcPrice+"원(판매가 : " + this.price + "원");
		} else {
			System.out.println("행사아님");
		}
 */




package opp.basic7;

public class Test01 {
	public static void main(String[] args) {
		Drink a = new Drink();
		Drink b = new Drink();
		Drink c = new Drink();
		Drink d = new Drink();
		
		a.input("아메리카노", "음료", 2000, true);
		b.input("프라푸치노", "음료", 3500, false);
		c.input("치즈케이크", "빵", 3500, true);
		d.input("유기농샌드위치", "빵", 3000, false);
		
		a.result();
		b.result();
		c.result();
		d.result();
	}
	
}

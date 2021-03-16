package oop.method4;

public class Test01 {
	public static void main(String[] args) {
	
		Info a = new Info();
		Info b = new Info();
		Info c = new Info();
		
		a.set("Galaxy21S", "SK", 24, 1500000);
		b.set("iPhone12", "KT", 24, 1800000);
		c.set("V60", "LG", 30, 1200000);	
		
		a.result();
		b.result();
		c.result();
	}
}

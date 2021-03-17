package oop.modifier3_sol;

public class Test01 {
	public static void main(String[] args) {
		Info a = new Info();
		Info b = new Info();
		Info c = new Info();
		
		a.set("주간권", 900, 1800, 80000, 64000);
		b.set("야간권", 1900, 2200, 60000, 42000);
		c.set("심야권", 2000, 2359, 45000, 32000);
		
		a.result();
		b.result();
		c.result();
	
		
	}
}

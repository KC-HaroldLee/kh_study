package opp.basic6;

public class Test01 {
	public static void main(String[] args) {
		
		//opp.basic6.Student2_bk < 이렇게도 됨
		Student2_bk a = new Student2_bk();
		Student2_bk b = new Student2_bk();
		Student2_bk c = new Student2_bk();
		
		a.input("마리오", 1, 90, 80, 70);
		b.input("루이지", 1, 85, 85, 83);
		c.input("쿠파", 3, 70, 60, 65);
		
		a.result();
		b.result();
		c.result();
	}
}

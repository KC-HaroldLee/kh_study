package opp.basic8;

public class Test02 {
	public static void main(String[] args) {
		
		Student2_bk a = new Student2_bk();
		Student2_bk b = new Student2_bk();
		Student2_bk c = new Student2_bk();
		
		//문제점 1 실제 총점,평균값과 다를 수 있다.
		a.input("마리오", 1, 90, 80, 70);
		b.input("루이지", 1, 85, 85, 83);
		c.input("쿠파", 3, 70, 60, 65);
		
		//문제점 2 총점과 평균이 실시간으로 반영X
		a.result();
		b.result();
		c.result();
	}
}

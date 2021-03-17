package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		//과제
		Info a = new Info();
		Info b = new Info();
		Info c = new Info();

		a.set("스탠다드 룸", 4, 100000, 200000, 250000);
		b.set("슈페리어 룸", 4, 150000, 250000, 300000);
		c.set("디럭스 룸", 6, 300000, 450000, 550000);
	
		a.result();
		b.result();
		c.result();
			 
		//System.out.println("평균 차이" + (a.avg-b.avg) + "원");
	}
} 
 
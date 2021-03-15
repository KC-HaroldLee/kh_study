package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		Olympic a = new Olympic();
		Olympic b = new Olympic();
		Olympic c = new Olympic();

		//a~c를 주인공으로set코드를 실행하기 위한 준비물을 전달한다.
		a.set("김연아", "피겨스케이팅", 2, 0, 1);
		b.set("이상화", "스피드스케이팅", 1, 2, 1);
		c.set("윤성빈", "스켈레톤", 1, 0, 1);
		
		a.result();
		b.result();
		c.result();
	}
}

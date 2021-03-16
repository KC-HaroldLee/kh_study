package oop.basic5;

public class Student {
	//멤버변수
	String name;
	int score;
	
	//멤버메소드
	void set (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void result(){
		System.out.println("<학생정보>");
		System.out.println("이름 " + this.name);
		System.out.println("점수 " + this.score);
		if(this.score >=60) {
			System.out.println("통과");
		}
		else {
			System.out.println("재평가");
		}
	}
	
}

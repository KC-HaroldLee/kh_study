package oop.method1;

public class Student {
	//멤버 변수 : 객체(인스턴스)가 가져야할 값(데이터)을 저장
	String name;
	int javaScore;
	int dbScore;
	
	//멤버 메소드 : 객(인)가 실행할 수 있는 코드(기능)를 저장.
	void set(String name, int javaScore, int dbScore){
		this.name = name;
		this.javaScore = javaScore;
		this.dbScore = dbScore;
	}
	
	//만약 (피카츄, 20)으로 하면 어디로 넣을지 몰라서 에러뜸
	void set(String name, int dbScore){
		this.name = name;
		this.dbScore = dbScore;
	}
	
	void set(String name){
		this.name = name;
	}
	
	
	void result() {
		System.out.println("<학생정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("자바점수 : " + this.javaScore);
		System.out.println("DB점수 : " + this.dbScore);
	}
}

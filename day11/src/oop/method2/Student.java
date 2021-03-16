package oop.method2;

public class Student {
	// 멤버 변수 : 객체(인스턴스)가 가져야할 값(데이터)을 저장
	String name;
	int java;
	int db;

	// 멤버 메소드 :
	// 규칙 변수마다 설정하는 메소드를 1개씩 만들자. (setter method)
	void set(String name, int java, int db) {
		this.setName(name);
		this.setJava(java);
		this.setDb(db);
	}

	void setName(String name) {
		this.name = name;
	}

	void setJava(int java) {
		if (java >= 0 && java <= 100) {
			this.java = java;
		}
	}

	void setDb(int db) {
		if (db >= 0 && db <= 100) {
			this.db = db;
		}
	}

}

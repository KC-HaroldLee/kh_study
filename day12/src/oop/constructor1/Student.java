package oop.constructor1;

public class Student {
	private String name;
	private int java;
	private int database;
	

	//생성자
	//모든 클래스에 1개 이상 존재
	//반환타입을 작성할 수 없음
	//오로지 초기화를 위한 용도로 사용
	//과거에 만든 set메소드와 유사
	//오버로딩가능
	
	//생성방법 1 : 이름만 설정하여 생성이 가능하다.
	public Student(String name) { //생성자는 클래스 이름과 같아야한다.
		this.setName(name);
	}

	//생성방법 2 : 이름과 점수를 모두 설정하여 생성이 가능하다.
	public Student(String name, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	public int getDatabase() {
		return database;
	}


	public void setDatabase(int database) {
		this.database = database;
	}


	
	
	
}

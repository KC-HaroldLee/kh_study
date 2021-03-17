package oop.modifier1;

public class Student {
	//private = 클래스 외부 접근을 차단한다.
	private String name;
	private int java;
	private int database;

	void setName(String name) {
		this.name = name;
	}
	
	void setJava(int java) {
		this.java = java;
	}
	
	void setDatabase(int database) {
		this.database = database;	
	}
	
	void set(String name, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}
	
	//getter method의 기본 형태
	//일단 보이드
	//void getName() {
	String getName() {
		return this.name;
	}
	int getJava() {
		return this.java;
	}
	int getDatabse() {
		return this.database;
	}
	
	//가상의 getter method도 추가 가능
	//변수가 없는대도 가능
	int getTotal() {
		return this.java + this.database;
	}
	
	double getAverage() {
		return getTotal()/2.0;
	}
}

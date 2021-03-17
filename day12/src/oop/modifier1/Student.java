package oop.modifier1;

public class Student {
	//private = 클래스 외부 접근을 차단한다.
	private String name;
	private int java;
	private int database;

	//public 외부 접근을 허용한다.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setDatabase(int database) {
		this.database = database;	
	}
	
	public void set(String name, int java, int database) {
		this.setName(name);
		this.setJava(java);
		this.setDatabase(database);
	}
	
	//getter method의 기본 형태
	//일단 보이드
	//void getName() {
	public String getName() {
		return this.name;
	}
	public int getJava() {
		return this.java;
	}
	public int getDatabse() {
		return this.database;
	}
	
	//가상의 getter method도 추가 가능
	//변수가 없는대도 가능
	public int getTotal() {
		return this.java + this.database;
	}
	
	public double getAverage() {
		return getTotal()/2.0;
	}
}

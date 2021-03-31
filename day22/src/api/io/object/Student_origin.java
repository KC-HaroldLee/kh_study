package api.io.object;

import java.io.Serializable;

public class Student_origin implements Serializable{ // 좀 웃긴 녀석이다.
	private String name;
	private int score;
	private String phone;
	
	//생성자
	public Student_origin(String name) {
		super();
		this.name = name;
	}
	public Student_origin(String name, int score, String phone) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
		
	//getter setter
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

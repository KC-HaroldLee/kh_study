package collections2;

public class Student {
	private String name;
	private int score;
	private String phone;
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, int score, String phone) {
		super();
		this.name = name;
		this.score = score;
		this.phone = phone;
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

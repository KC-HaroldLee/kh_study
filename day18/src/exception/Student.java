package exception;
//Test07을 클래스로 만들기
public class Student {
	//멤버변수
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//생성자
	public Student() {
		super();
	}


	public Student(String name, int korean, int english, int math) {
		super();
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}


	public void setKorean(int korean) {
		this.korean = korean;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public void setMath(int math) {
		this.math = math;
	}

	//getter
	public String getName() {
		return name;
	}


	public int getKorean() {
		return korean;
	}


	public int getEnglish() {
		return english;
	}


	public int getMath() {
		return math;
	}


	
	 
	



}

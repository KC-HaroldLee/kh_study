package exception;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

//Test07을 클래스로 만들기
public class Student_01 {
	//멤버변수
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//생성자
	public Student_01() {
		super();
	}


	public Student_01(String name, int korean, int english, int math) {
		super();
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}

	//setter
	public void setName(String name) {
		String regexName = "^[가-힣]{2,7}$";
		if(!Pattern.matches(regexName, name)){
			//return; // 냅두면 종료시켜버린다. (외부에서 문제가 발생했음을 알 수 없다.)
			//이렇게 예외가 발생했음을 소문낸다.
			throw new InputMismatchException("이름은 한글 2~7자로 설정하세요.");
	}
		this.name=name;
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

package oop.keyword;

public class Student {
	//목표 : 이름을 설정하면 변경이 불가능하게 만들기
	//하지만 초기값이 없으면 final은 안된다.
	//생성자에 반드기 이름이 설정되도록 만들면 문제가 해결됨
	private final String name; // 초기값이 없다.
	
	public Student(String name) {
		this.name = name; // 여기서 '믿음'을 준다.
	}
}

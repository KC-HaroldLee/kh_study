package oop.modifier2;
import oop.modifier1.*;
public class Test01 {
	public static void main(String[] args) {
		//oop.modifier1 패키지의 Student 생성
		
		Student a = new Student();
		//자바에서는 아무 제한 키워드가 없으면
		//"패키지"까지만 접근가능
		//그래서 접근을 허용한다.
		//public 외부 접근을 허용한다.
		a.setName("피카츄");

	}
}

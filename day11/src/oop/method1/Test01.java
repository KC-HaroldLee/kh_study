package oop.method1;

public class Test01 {
	public static void main(String[] args) {

		
		//객(인) 생성
		Student a = new Student();
		
		//초기화 : 단계별로 하고 싶다.
		//=변수를 가급적 이용하고 싶지 않다면?
		//=객체 지향 프로그래밍은 메소드 위주로 실행한다.
		
		a.set("갑", 70, 0); // 만약 뒤에 걸 나중에 봤다고 해보자.
		a.set("갑", 70, 80); // 이렇게 할거니?
		
		//여러개를 만들자?
		//그럼 메소드 이름은? 엥 같아도 되...네?
		
		
		//출력
		a.result();
	}
}

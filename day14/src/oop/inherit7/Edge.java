package oop.inherit7;

public class Edge extends Browser {

	@Override // 어노테이션(명찰같은거) : 하단의 메소드는 오버라이드 되었음을 명시
	public void search() {
		System.out.println("빙 검색하는 중입니다");
	}


}

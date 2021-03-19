package oop.inherit7;
//상위 클래스
public class Browser {

	
	//메소드 : 재정의를 고려하여 설계
	// = 재정의(override)란 메소드의 내용을 변경하는 것을 의미 (메소드 중복 정의)
	
	//1. 페이지 이동 기능
	//= 이 기능은 브라우저마다 차이가 있지 않나 고민해 보자.
	//= 이 기능은 모든 브라주저마다 동일 해야 하므로 + final
	public final void move() {
		System.out.println("페이지를 이동합니다.");
	}
	
	//2. 검색 기능(다르다)
	//= 크롬은 구글, 엣지는 빙
	//=검색 기능은 있으나 브라우저마다 어느 검색엔진을 쓰는지가 다름
	//= 재정의 가능
	public void search() {
		System.out.println("검색하는 중입니다.");
	}
}

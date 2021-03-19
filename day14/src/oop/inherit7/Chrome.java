package oop.inherit7;

public class Chrome extends Browser {
	// 상속을 받았으므로 메소드 2개 존재
	// =만약 메소드 내용이 마음에 들지 않는다면 변경해야하는데...

	// 여기서 먼저 가로채자!같은 이름으로 또 만들다
	// 오버 라이드.
	// 부모 클래스에서 final 붙이면 안됨
	public void search() {
		System.out.println("구글 검색하는 중입니다.");
	}
}

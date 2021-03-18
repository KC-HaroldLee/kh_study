package oop.inherit2;
//휴대폰이라면 가질 수 있는 공통 기능을 작성
//= 상위클래스 = 슈퍼클래스 = 부모클래스
//
public class Phone {
	// 멤버변수
	private String number;

	// 멤버 메소드
	public void call() {
		System.out.println("전화기능");
	}
	public void sms() {
		System.out.println("문자기능");
	}
	public void camera() {
		System.out.println("문자기능");
	}
}

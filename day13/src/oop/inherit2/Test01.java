package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
		//G21S랑 Ip12를 객체로 만든다.
		//(주의)Phone클래스는 절대로 객체로 만들지 않는다.
		
		Galaxy21S a = new Galaxy21S();
		a.call();
		a.sms();
		
		a.bixby();
		Iphone12 b = new Iphone12();
	}
}

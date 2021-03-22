package oop.poly2_sol;

public class IPhone12 extends Apple {

	public IPhone12(String color) {
		super(color);
	}
	public IPhone12(String color, String number) {
		super(color, number);
	}
	@Override
	public void siri() {
		System.out.println("아이폰12의 시리");
	}
	@Override
	public void call() {
		System.out.println("아이폰12의 전화");
	}
	@Override
	public void sms() {
		System.out.println("아이폰12의 sms");
	}

	public void iCloud() {
		System.out.println("아이폰12의 아이클라우드");
	}

}

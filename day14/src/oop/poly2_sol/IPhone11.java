package oop.poly2_sol;

public class IPhone11 extends Apple {

	public IPhone11(String color) {
		super(color);
	}
	public IPhone11(String color, String number) {
		super(color, number);
	}
	@Override
	public void siri() {
		System.out.println("아이폰11의 시리");
	}
	@Override
	public void call() {
		System.out.println("아이폰11의 전화");
	}
	@Override
	public void sms() {
		System.out.println("아이폰11의 sms");
	}

	public void iTunes() {
		System.out.println("아이폰11의 아이튠즈");
	}

}

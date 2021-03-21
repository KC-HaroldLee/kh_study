package oop.poly2;

public class Apple extends Phone {

	public Apple(String color) {
		if (color == "화이트" || color == "블랙" || color == "핑크") {
			this.setColor(color);
		}
		this.setColor(color);
	}

	public Apple(String color, String number) {
		if (color == "화이트" || color == "블랙" || color == "핑크") {
			this.setColor(color);
		}
		this.setNumber(number);
	}

	@Override
	public void call() {
		System.out.println("아이폰의 전화기능을 실행합니다.");
	}
	
	@Override
	public void sms() {
		System.out.println("아이폰의 sms기능을 실행합니다.");
	}
	
	public void siri() {
		System.out.println("아이폰의 시리를 실행합니다.");
	}
}
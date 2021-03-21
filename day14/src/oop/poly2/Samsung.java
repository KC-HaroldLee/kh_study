package oop.poly2;

public abstract class Samsung extends Phone {

	public Samsung(String color) {
		this.setColor(color);
	}

	public Samsung(String color, String number) {
		if (color == "골드" || color == "실버" || color == "아쿠아블루") {
			this.setColor(color);
		}
		this.setNumber(number);
	}
	
	public void samsungStore() {
		System.out.println("갤럭시의 삼성스토어를 실행합니다.");
	}
	
	@Override
	public void call() {
		System.out.println("갤럭시의 전화기능을 실행합니다.");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시의 sms기능을 실행합니다.");	
	}
	
}
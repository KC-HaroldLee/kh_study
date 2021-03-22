package oop.poly2_sol;

public abstract class Samsung extends Phone {

	public Samsung(String color) {
		super(color);
	}

	public Samsung(String color, String number) {
		super(color, number);
	}

	public abstract void samsungStore();

	// 색상 설정의 재정의
	public void setColor(String Color) {
		switch (color) {
		case "골드":
		case "실버":
		case "아쿠아블루":
			super.color = color;
		}
	}
}

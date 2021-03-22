package oop.poly2_sol;

public abstract class Apple extends Phone{
	public Apple(String color) {
		super(color);
	}
	public Apple(String color, String number) {
		super(color, number);
	}

	public abstract void siri();

	// 색상 설정의 재정의
	public void setColor(String Color) {
		switch (color) {
		case "화이트":
		case "블랙":
		case "핑크":
			super.color = color;
		}
	}

}

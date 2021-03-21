package oop.poly2;

public abstract class Phone {

	protected String color;
	protected String number;
	
	//공통 기능
	public abstract void call();
	public abstract void sms();
	
	//getter
	public String getColor() {
		return color;
	}
	public String getNumber() {
		return number;


	//setter
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
}

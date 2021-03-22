package oop.poly2_sol;

public class GalaxyNote10 extends Samsung{

	public GalaxyNote10(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public GalaxyNote10(String color, String number) {
		super(color, number);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void samsungStore() {
		System.out.println("갤놑10 삼성스토어");		
	}
	@Override
	public void call() {
		System.out.println("갤놑10 전화");		
		
	}
	@Override
	public void sms() {
		System.out.println("갤놑10 sms");		
		
	}
	
	public void note() {
		System.out.println("갤놑10 노트");
	}


}

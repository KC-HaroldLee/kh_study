package oop.poly2_sol;

public class Galaxy21s extends Samsung{

	public Galaxy21s(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public Galaxy21s(String color, String number) {
		super(color, number);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void samsungStore() {
		System.out.println("갤21s 삼성스토어");
		
	}
	@Override
	public void call() {
		System.out.println("갤21s 전화");		
	}
	@Override
	public void sms() {
		System.out.println("갤21s sms");		
	}
	
	public void bixby() {
		System.out.println("갤21s 빅스비");
	}

}

package oop.poly2;

public class Main {
	public static void main(String[] args) {
		
	Galaxy21s g21s = new Galaxy21s("블랙" , "01033590000");
	g21s.call();
	g21s.sms();
	g21s.samsungStore();
	g21s.bixby();
	
	GalaxyNote10 note10 = new GalaxyNote10("실버" , "01056240000");
	note10.call();
	note10.sms();
	note10.samsungStore();
	note10.note();
	
	IPhone11 i11 = new IPhone11("화이트", "01089890000");
	i11.call();
	i11.sms();
	i11.siri();
	i11.iTunes();
	
	IPhone12 i12 = new IPhone12("핑크", "01055550000");
	i12.call();
	i12.sms();
	i12.siri();
	i12.iCloud();	
	}
}

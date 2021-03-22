package oop.poly2_sol;

public class Main {
	public static void main(String[] args) {
	Galaxy21s g21s = new Galaxy21s("골드");
	g21s.call();
	g21s.sms();
	g21s.samsungStore();
	g21s.bixby();

//이하생략
	//배열 만들기 모두 된다.
	Galaxy21s[]arr = new Galaxy21s[10];
	//Samsung[]arr = new Samsung[10];
	//Phone[]arr = new Phone[10];
	
	for(int i=1; i<arr.length; i++) {
		arr[i] = new Galaxy21s("실버");
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(i+1 + "번째 폰 정보");
		System.out.println("번호 : " + arr[i].getNumber());
		System.out.println("색상 : " + arr[i].getColor());
	}
}
}

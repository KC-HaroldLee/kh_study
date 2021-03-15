package oop.basic1;

public class Test02 {
	public static void main(String[] args) {
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		Message d = new Message();
		
		a.sender = "초롱초롱 라이언";
		a.content = "응 먹고 들어가는중";
		a.time="오후 12:29";
		a.remain=0;
		
		System.out.println(a); //참조변수 정보 블라블라
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.remain);
		
	} 
	
}

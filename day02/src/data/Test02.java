package data;
import java.lang.*; //  쓰는 연습을 하자

public class Test02 { //폰트 바꿔야겠다 o0구분이 안간다. 폰트 Corbel ▷ Calibri
	
	/* 자장면 5000원 짬뽕 6000원 
	 이 가게에서 자장면 2그릇, 짬뽕 3그릇 주문 후 2천원 할인 쿠폰을 제시한 경우 영수증에 찍힐 금액들을 계산하여 출력 (자장면, 짬뽕, 합계, 최종결제금액) 
	  
	 */
		
	public static void main(String [] args) {
	int a = 5000; //자장면
	int b = 6000;//짬뽕
	System.out.println(a*2);
	System.out.println(b*3);
	System.out.println(a*2+b*3);
	System.out.println(a*2+b*3-2000);
}
}

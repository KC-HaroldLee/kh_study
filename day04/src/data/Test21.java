package data;
	import java.lang.*;
public class Test21 {
	public static void main(String[] args) {
		//아웃백에서 결제금액이 85000원이 나왔습니다.
		//다 내기 아까워서 신용카드를 신나게 찾은 뒤
		//30% 할인되는 카드를 찾았습니다
		//할인 전과 할인 후 결제금액을 출력하세요.
		
		//입력
		int price = 85000;
		int cardPresA = 30; //나중에 다른 할인 카드를 추가하기 좋을 거 같다.
		
		//계산
		int dcRate = cardPresA; //카드가 추가된다면 바뀔 부분
		double pay = price * (100-dcRate) /100; // 나누는 과정에서 손실될까봐 혹시 몰라서 추가하는(1)
		
		
		//출력
		System.out.println("가격 " + price +  "원");
		System.out.println("카드할인 " + (dcRate) +  "% 할인");
		System.out.println("지불금액 " + (int)pay/10*10 +  "원"); 

		// 설마 아웃백이 1원단위까지 받을리가...(/10*10 ) 혹시 몰라서 추가하는(2)
	}
}

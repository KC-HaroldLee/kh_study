package data;
	import java.lang.*;
public class Test07 {
	public static void main (String[]args) {
		
	// 1/N계산기만들기

	//7명이서 술값이 20만원 나왔습니다.
	//1인당 내야할 금액을 1원단위 까지 계산하여 출력하시고
	//자투리 금액을 계산하여 출력하세요.
	
	int people = 7;
	int total = 200000;
	
	int eachPay = total/people;
	int rest= total%eachPay;
	System.out.println("일인당" + eachPay);
	System.out.println("자투리 금액" + rest);
	}
}

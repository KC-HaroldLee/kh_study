package data;

import java.lang.*;
/* 어떤 사람이 10시 20분 30초에 PC방 이용을 시작해서 15시 10분 25초에 사용을
 * 종료했습니다. 
 * 1. 사용시간 출력
 * 2. 1시간 1000원이면 총 얼마?
 */
public class Test05_pay {
	public static void main(String[]args) {
		int hourA=10,  minuteA=20,  secondA=30;
		int hourB=15,  minuteB=10,  secondB=25;
		
		//사용시간 계산
		int timeA=hourA*3600 + minuteA*60 + secondA;
		int timeB=hourB*3600 + minuteB*60 + secondB;
		int timeUse=timeB - timeA;
		
		//int hourUse=timeUse/3600;
		//int minuteUse=(timeUse-(hourUse*3600))/60;
		//int secondUse=(timeUse-(minuteUse*60))%60;
		
		int hourUse=timeUse/3600;
		int minuteUse = timeUse%3600/60;
		int secondUse= timeUse%3600%60; //중간%3600은 생략해도 된다.
		
		//사용시간 출력
		System.out.println("사용하신 시간은 " + hourUse+"시간 "+ minuteUse + "분 " + secondUse + "초 입니다");
		
		
		//추가계산 : 1시간당 1000원인경우 얼마를 내야해는가.
		//1초라도 이요하면 1000원씩 과금하도록
		// ex : 4시간 0분 0초 --> 0 + 0 은 0 이니까 돈 안 냄
		// ex : 4시간 2분 1초 --> 2+ 1 은 3이니까 돈 안 냄
		int plus = (minuteUse + secondUse + 999 ) /1000;
		System.out.print(plus);
		int pay = (hourUse + plus) * 1000;
		System.out.println("사용하신 시간은 " + pay + "원입니다");

		
		
		
	}
}
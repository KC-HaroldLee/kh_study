package data;

import java.lang.*;
import java.util.Scanner;

public class Test04_chal {
	public static void main(String[]args) {
		//시간계산 : 가장 작은 단위로 변환하려푼다.
		
		//입력값
		Scanner s = new Scanner(System.in);
		int hourA = 1, minuteA = 50; // 나열하자
		int hourB = 2,  minuteB = 30;
		
		//계산
		int timeA = hourA * 60 + minuteA;
		int timeB = hourB * 60 + minuteB;	
		
		int timeTotal = timeA + timeB;
		
		int hourRslt = timeTotal/60;
		int minuteRslt = timeTotal%60;
		
		//결과
		System.out.println(timeTotal + timeTotal);
	
		
	}

}

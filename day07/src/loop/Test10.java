package loop;

import java.lang.*;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		// 타이머 만들기
		// 분과 초를 입력하면 시간이 0이 될 때까지 감소하며 화면에 메시지가 출력되도록 구현
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("분을 입력하세요.");
		int minuteInput = sc.nextInt();
		System.out.println("초을 입력하세요.");
		int secondInput = sc.nextInt();
		*/
		
		System.out.println("시간분을 적어주세요. 예 : 2분 30초면 230, 20분 03초면 2003");
		int timeInput = sc.nextInt();
		int minuteInput = timeInput/100;
		int secondInput = timeInput-(minuteInput*60);		

		int time = (minuteInput * 60) + secondInput;

		for (int i = time; i >= 0; i -= 1) {
			int minuteCd = i / 60;
			int secondCd = i % 60;

		//1초 정지(지연)코드
		//Thread.sleep(1000L);
			
			System.out.println(minuteCd + "분" + secondCd + "초 후 알람이 울립니다.");
		}
		System.out.println("띠링띠링~");
	}

}

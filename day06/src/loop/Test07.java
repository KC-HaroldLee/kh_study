package loop;

import java.lang.*;

public class Test07 {
	public static void main(String[] args) {
		// [2] 한달(30일)간의 다이어트 계획을 세우고 있습니다.
		// 푸시업을 차근차근 늘려가며 매일 할 계획이며, 첫날은 10개만 하고 둘째날부터 전날보다 3개씩 개수를 늘려가며 할 예정입니다.
		// 한달동안 일자별로 하게되는 푸시업 개수를 출력하세요.
		// (가능하면 한달동안 하게되는 총 푸시업 개수도 출력하세요)

		int pushUpCount = 10;
		int pushUpTotal = 0;
		for (int i = 0; i < 30; i += 1) { // 첫날~30일까지
			System.out.println(i + 1 + "일차에 할 푸쉬업 횟수는 " + pushUpCount + "입니다.");
			pushUpTotal = pushUpTotal + pushUpCount;
			pushUpCount += 3; // 일단 1일차 하고. 다음날 3씩 증가

		}
		System.out.println("30일까지 모두 " + pushUpTotal + "개의 푸쉬업을 하였습니다.");
		// 계산이 두들기다가 엑셀로 검산해보니...더 빠르구나
	}
}
package loop_change;

import java.lang.*;

public class Test07 {
	public static void main(String[] args) {

		/*int pushUpCount = 10;
		int pushUpTotal = 0;
		for (int i = 0; i < 30; i += 1) { // 첫날~30일까지
			System.out.println(i + 1 + "일차에 할 푸쉬업 횟수는 " + pushUpCount + "입니다.");
			pushUpTotal = pushUpTotal + pushUpCount;
			pushUpCount += 3; // 일단 1일차 하고. 다음날 3씩 증가
		}
		System.out.println("30일까지 모두 " + pushUpTotal + "개의 푸쉬업을 하였습니다.");
		 */
		
		int pushUpCount = 10;
		int pushUpTotal = 0;
		int i = 0;
		while (i < 30) { // 첫날~30일까지
			System.out.println(i + 1 + "일차에 할 푸쉬업 횟수는 " + pushUpCount + "입니다.");
			pushUpTotal = pushUpTotal + pushUpCount;
			pushUpCount += 3; // 일단 1일차 하고. 다음날 3씩 증가
			i += 1;

		}
		System.out.println("30일까지 모두 " + pushUpTotal + "개의 푸쉬업을 하였습니다.");
	}
}
package loop2;

import java.lang.*;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		System.out.println("구구단을 외자! 구구단을 외자!");
		Scanner sc = new Scanner(System.in);

		int lives = 3;
		int num1 = 2;
		int num2 = 1;
		int correctCount = 0;
		
		while (lives>=0 && num2 <= 9) {

			int answerCorrect = num1 * num2;

			System.out.println(num1 + "X" + num2 + "= ?");

			int answer = sc.nextInt();
			if (answer == answerCorrect) {
				System.out.println("정답!");
				correctCount +=1;
			} else {
				System.out.println("오답! 기회 -1!");
				lives = lives - 1;
			}
			num2 +=1;
		}
		System.out.println("게임 끝");
		System.out.println("정답 개수 " + correctCount);

	}
}

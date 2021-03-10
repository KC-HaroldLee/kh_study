package loop2;

import java.lang.*;
import java.util.Scanner;

public class Test03_game {
	public static void main(String[] args) {
		// 사용자에게 숫자를 입력받아 문제를 푸세요.
		// 추가규칙 : 1:1 게임

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int count = 0;
		int total = 0;

		while (total < 100) {
			System.out.println("A선수 숫자를 입력해주세요.");
			num = sc.nextInt();
			count = count + 1;
			total = total + num;

			if (total <= 100) {
				System.out.println("B선수 숫자를 입력해주세요.");
				num = sc.nextInt();
				count = count + 1;
				total = total + num;
			}
			else {
			break;
			}
		}
		System.out.println("busted!");
		System.out.println(count + "회 입력");
		System.out.println((total - num) + "에서 " + num + "을 입력하여 " + total + "이 되었습니다.");
		if (total%1 == 1) {
		System.out.println("승자 : A!");
		}
		else {
		System.out.println("승자 : B!");
		}
	}
}

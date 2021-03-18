package opp.keyword6;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3보");
		int user = sc.nextInt();
		sc.close();
		switch (user) {
		case RSP.SCISSORS:
			System.out.println("가위를 내셨습니다.");
		case RSP.ROCK:
			System.out.println("바위를 내셨습니다.");
		case RSP.PAPER:
			System.out.println("보를 내셨습니다.");
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}

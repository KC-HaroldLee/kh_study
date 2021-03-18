package opp.keyword6;

import java.util.Scanner;

public class Test01 {
	
	// 간단 가위바위보 게임
	// 문제점 : 가독성이 낮다. 숫자와 가위바위보의 상관관계 파악이 어렵다.
	// 해결책 : 변수를 보관한다. 클래스에 static형태로 변수를 선언한다.
	// 이러면 상수가 된다.
	public static final int scissors = 1;
	public static final int rock = 2;
	public static final int paper = 3;

public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3보");
		int user = sc.nextInt();
		sc.close();
		switch (user) {
		case scissors:
			System.out.println("가위를 내셨습니다.");
		case rock:
			System.out.println("바위를 내셨습니다.");
		case paper :
			System.out.println("보를 내셨습니다.");
		default : 
			System.out.println("잘못입력하셨습니다.");
		}
	}
}

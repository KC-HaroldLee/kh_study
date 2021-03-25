package exception;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//예외와 오류
		//오류 : 실행이 불가능하게 만드는 상황
		//예외 : 실행 후에 날 수 있는 돌발상황
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a/b;
		int d = a%b;
		System.out.println(c + "씩");
		System.out.println(c + "원");
		
		
		//프로그램이 멈춰야 예외다.
		
		//잘 되긴 한거
		//
		
		
		//예외인거
		
		//java.util.InputMismatchException
		//int 범위 넘어난거.
		//int가 아닌 값(분자열)을 집어 넣은 경우
		//1.5입력
		
		// java.lang.ArithmeticException
		//인원수 0입력
	}

}

package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//예외 처리를 한 뒤 처리 블록에서 기존의 예외 메시지를 보고 싶은 경우
		//오류를 추적하여 해결하기 위해서 위치 정보를 봐야할 경우가 발생한다.
		//예외 객체를 이용하여 예외메시지를 출력하도록 지시한다.
		
		try {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int c = a/b;
		int d = a%b;
		System.out.println(c + "씩");
		System.out.println(c + "원");
		}
		
		
		catch(RuntimeException e1){
			e1.printStackTrace();
		}
		
		
		/*
		catch(InputMismatchException e1){
			System.out.println("멍청아");
		}
		
		catch(ArithmeticException e2){
			System.out.println("똥멍청아");
		}
		
		*/
		//프로그램이 멈춰야 예외다.
		
		//잘 되긴 한거
		//
		
		
		//예외인거
		

	}

}

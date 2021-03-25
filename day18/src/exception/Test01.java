package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 이것들을
		//java.util.InputMismatchException
		//java.lang.ArithmeticException
		//try블록을 만들어서 문제가 될 소지를 있는 명역을 감시한다.(CCTV)
		//catch 만들어서
		
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
			System.out.println("오류발생!");
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

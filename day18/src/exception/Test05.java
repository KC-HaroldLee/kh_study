package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//강제 예외
		
		try {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
			if(a <0) {
				//실행을 "멈추고" catch 블록으로 던지는 코드
				throw new InputMismatchException("***InputMismatchException***");
			}
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

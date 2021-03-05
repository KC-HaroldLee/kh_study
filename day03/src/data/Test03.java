package data;

public class Test03 {
	public static void main(String [] args) {
		//정수에 대한 이해 분석
		//1. 정수는 범위가 있다.
		//byte : -128~127 까지 256개의 숫자를 저장할 수 있다.
		byte a = 100;
		//int b = 1000000000000000; 오류
		// 아 long은 L을 붙여야하는구나.
		long c = 10000000000L; 
		
		//2. 정수는 순환구조를 가진다.
		int d = 2100000000+ 100000000; // -2094967296 로 나온다, 
		System.out.println(d);
		//해결 방법
		long e = 2100000000L+ 100000000L; // 22억 제대로 나온다.
		System.out.println(e);
		
		//3. 정수의 계산은 결과값은 정수
		
	}
}

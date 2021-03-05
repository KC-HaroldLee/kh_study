package data;

import java.lang.*;
public class Test12 {
	public static void main (String[] args) {
		//목표 : 자료형들 간의 서열정리
		//- 정수 : byte, short, int, long
		//- 실수 : float, double
		
		//큰 쪽으로는 자동으로 되고
		//작은 쪽으로는 자동으로 되지 않는다(강제 변환 필요) 
		
		//int vs long
		//int < long
		int a = 10;
		long b = a; // 변환연산을 사용하지 않아도 자동 형변환(묵시적 형변환)
		System.out.println(b);
		
		
		long c = 10L;
		//int d = c; // 허용하지 않는다.
		int d = (int)c; // 변환 연산을 이용한 강제 형변환(명시적 형변환)
		System.out.println(d);
		
		//long vs float
		//=long은 8바이트 정수
		//=float는 4파이트 실수
		long e = 10L;
		float f = e;
		System.out.println(f);
		
		float g = 10.5f;
		//long h = g; //허용하지 않는다
		long h = (long)g; //은 된다.
		System.out.println(h);
	}

}

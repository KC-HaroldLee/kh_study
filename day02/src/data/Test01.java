package data;// 위치 먼저 나와야 한다. import는 나중에

import java.lang.*;

public class Test01 {
	public static void main(String [] args) { //main메소드를 만들었다
		//Q. 한 그릇에 5,000원인 자장면 3그릇 먹고 3천원 할인 쿠폰을 내면?
		// 좋지 않은 방법(반복되느 계산 코드가 등장)
	System.out.println(5000*3);
	System.out.println( 5000*3-3000);
	
		//바람직한 답변
		int a = 5000*3; //a라는 저장공간을 만들고5000*3을 저장
		System.out.println(a);	
		System.out.println(a-3000);	
	}
}

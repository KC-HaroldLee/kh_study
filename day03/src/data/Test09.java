package data;
import java.lang.*;
public class Test09 {
	public static void main(String[]args) {
		//실수 : 소수점이 있는 숫자.
		
		//float a = 1.2345;  오류임
		
		//1. 실수는 부정확함 . 자리수 제한, 반올림
		//2. 실수가 포함된 계산은 실수다.
		float a = 1.23123129451298416f; // long때 처럼 표시한다.
		double b = 9.876501927319023712903; //오류는 안뜨지만 자리수의 차이가 있다. , 반올림도 한다.
	
		System.out.println(10/3); //int / int
		System.out.println(10/3.0);// int /double
		System.out.println(10/3f); // int / float
		
	}
	
}

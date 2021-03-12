package array;
import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
		//데이터 맞교환
		//Q. a와 b값을 서로 교체 (swap)하기
		
		int a = 10; int b =20;
		
		// 빈 변수를 만든다, 빈 배열을 만들고...
		
		int c; // 중개인같다.
		c = a;
		a = b;
		b = c;
		
		System.out.println("a  = " + a);
		System.out.println("b  = " + b);
		
	}

}

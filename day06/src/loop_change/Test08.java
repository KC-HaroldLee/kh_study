package loop_change;

import java.lang.*;

public class Test08 {
	public static void main(String[] args) {

		long coin = 1;
		long coinTotal = 0; // if를 쓰면... 뭔가 되지 않을까...
		for (int i = 0; i < 30; i += 1) {
			System.out.println("노인은" + (i + 1) + "번재 날에 " + coin + "원을 받았습니다.");
		}
		System.out.println("노인은 30일까지 총 " + coinTotal + "원을 받았습니다.");
		
		for (int i = 30; i < 40; i += 1) {
 			coinTotal = coinTotal + coin;
			coin *= 2; // 2배씩 증가
		}
		System.out.println("40일까지는 총 " + coinTotal + "원을 받게됩니다.");
	}
}
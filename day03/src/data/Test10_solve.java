package data;
	import java.lang.*;
public class Test10_solve {
	public static void main (String[]args) {

	//문제 1
     	//타율 계산
		//야구선수 타율은 '안타수 / 타수'로 계산됩니다.
		//안타에는 홈런이 포함된다, 야구선수 A의 지난 시즌 기록은 -
		//120타수 25안타 11홈런 
		//이선수의 타율을 구하여 화면에 출력

		//입력 double로 시작하지 말자.
		int chance = 120;
		int hit = 25;
		int hr = 11;
		
		// 계산
		// 타율 = (안타 + 홈런) / 타수 = (실수형태의) 타율
		
		//자 실수를 끼워서 만드는 방법이다.
		//double rate = (hit + hr + 0.0 ) / chance;
		//double rate = (hit + hr * 1.0 ) / chance;
		
		//변환연산을 이용한 방법 "(double)"을 붙인다.
		double rate = (hit + hr) / (double)chance;
		
		
		//출력
		System.out.println("타율은 : " + rate);
}
}

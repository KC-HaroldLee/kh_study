package loop;

import java.lang.*;

public class Test08_40days {
	public static void main(String[] args) {
		// [3] 고대 그리스에 현명한 노인이 있었습니다.
		// 왕이 소문을 듣고 찾아가서 원하는 게 있으면 줄테니 말해봐라! 라고 하니까 노인이 다음과 같이 말합니다
		// 저는 욕심이 별로 없으니까 30일동안 첫날은 1원만 주시고, 그 다음날부터는 전날의 2배를 주시면 됩니다.
		// 노인이 받게될 일자별 금액과 마지막 잔고를 출력하세요.
		// (40일 동안 받으면 얼마인지도 계산해보세요)

		long coin = 1; // 64일째에 터짐
		long coinOverLong; // 터질 때를 대비
		long coinTotal = 0; // 64일째에 터짐
		long coinTotalOverLong;

		for (int i = 0; i < 65; i += 1) {
			System.out.println("노인은" + (i + 1) + "번재 날에 " + coin + "원을 받았습니다.");
			coinTotal = coinTotal + coin;
			//System.out.println("CT = " + coinTotal);
			if(coinTotal*2>0) {
			coin *= 2; // 2배씩 증가
			}
			else if(coinTotal*2<0){
			coin = 
			coinOverLong = coin+9223372036854775807L+1+1;
		}
		
		
		if(coinTotal*2<0) {

			//	선언한 변수에서 정수가 넘칠 때
			// 	변수 byte 기준으로는
			//	예상값	출력값
			//	128		-1
			//	129		-2
			//	130		-3 ..이니까

			//  시작점을 s로 두고 e를 끝점으로 두면
			//	e+1	 = s
			//	e+2	 = s+1
			//	e+3	 = s+2

			//	넘쳐흐른(?)값은 x라고하고...
			//	y는 출력값(예상치 못한 음수?)
			//	s는 시작점
			//	x	 = y-s+1
			
			//	long인경우...
			//	x = y+9223372036854775808+1

			coinTotalOverLong = coinTotal-(-9223372036854775808L)+1; //
			System.out.println("여기서 넘친다" + coinTotal);				
			coinOverLong = coin+9223372036854775807L+1+1;

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
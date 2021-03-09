package loop;

import java.lang.*;

public class Test08 {
	public static void main(String[] args) {
		// [3] 고대 그리스에 현명한 노인이 있었습니다.
		// 왕이 소문을 듣고 찾아가서 원하는 게 있으면 줄테니 말해봐라! 라고 하니까 노인이 다음과 같이 말합니다
		// 저는 욕심이 별로 없으니까 30일동안 첫날은 1원만 주시고, 그 다음날부터는 전날의 2배를 주시면 됩니다.
		// 노인이 받게될 일자별 금액과 마지막 잔고를 출력하세요.
		// (40일 동안 받으면 얼마인지도 계산해보세요)

		long coin = 1;
		long coinTotal = 0; // if를 쓰면... 뭔가 되지 않을까...
		for (int i = 0; i < 30; i += 1) {
			System.out.println("노인은" + (i + 1) + "번재 날에 " + coin + "원을 받았습니다.");

			coinTotal = coinTotal + coin;
			System.out.println("--------->" + (i + 1) + "번날까지" + coinTotal + "원을 받았겠죠?");
			coin *= 2; // 2배씩 증가

		}
		System.out.println("노인은 30일까지 총 " + coinTotal + "원을 받았습니다.");
		
		for (int i = 30; i < 40; i += 1) {
 			coinTotal = coinTotal + coin;
			coin *= 2; // 2배씩 증가
		}
		System.out.println("40일까지는 총 " + coinTotal + "원을 받게됩니다.");
	}
}
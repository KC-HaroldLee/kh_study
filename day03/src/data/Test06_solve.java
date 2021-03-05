package data;
	import java.lang.*;
public class Test06_solve {
	public static void main(String[]args) {

		int count = 5;
		int price = 900;
		
		//입력
		//무료개수 = 구매개수/2
		//유료개수 = 구매개수 - 무료개수
		//계산금액 = 유료개수 * 900원
		int freeCount = count / 2;
		int payCount = count - freeCount;
		int payAmount = payCount * price;
		
		//출력
		System.out.println(count);
		System.out.println(freeCount);
		System.out.println(payAmount);

		
	}
}

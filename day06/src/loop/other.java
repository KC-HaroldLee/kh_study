package loop;
import java.lang.*;
public class other {
    public static void main(String[] args) {
		// 한달(30일)간 다이어트 계획. 푸시업 첫날 10개, 둘째날 3개추가 해서 매일 3개씩 추가
		// 가능하면 한달동안 하게되는 총 푸시업 개수도 출력하시오

		// int pushUp=3*(day-1)+10;

		int pushUp = 10;
		int total = 10;
		for (int i = 0; i < 30; i += 1) {
			System.out.println(pushUp + i * 3);
			total += i * 3;

		}
		System.out.println("총 푸시업 횟수는" + total + "번이다.");

	}
}
 

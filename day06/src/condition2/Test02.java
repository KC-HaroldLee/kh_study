package condition2;

import java.lang.*;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// switch를 써보자 test01의 문제점을 개선
		// ex : 방향키를 입력받아 처리하는 예제(2:아래쪽, 4:왼쪽, 6:오른쪽, 8위쪽)
		// = 한 번의 이동으로 해당지점을 탐색한다.
		// = 멈추고 싶으면 break키워드를 사용하라 (구문탈출키워드)
		// = 구간이 안된다.

		// 입력
		int direction = 2;

		// 출력

		// if문을 각각 하나의 책이라고 생각하자.
		// switch는 책갈피

		Scanner sc = new Scanner(System.in);
		direction = sc.nextInt();
		sc.close();
		switch (direction) {

		case 2:
			System.out.println("아래쪽으로 이동");
			break; // 이거 없으면 아래 쭈욱 다 말함
		case 4:
			System.out.println("왼쪽으로 이동");
			break;
		case 6:
			System.out.println("위쪽으로 이동");
			break;
		// case 8:
		default:
			System.out.println("오른쪽으로 이동");
			break;
		}
	}
}

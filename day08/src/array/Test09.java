package array;

import java.lang.*;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		// 사용자에게 숫자를 5개 입력받아서
		// 가장 작은 숫자와 위치와 값을 구하여 출력.

		// 입력
		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			data[i] = sc.nextInt();
		}

		// 계산
		int order = 1;
		int min = data[order];

		int i = 0;
		for (i = 0; i < 5; i++) {
			if (min > data[i]) {
				min = data[i];
				order += 1;
			} else {
			}
		}
		
		// 출력
		System.out.println("가장작은 숫자는 " + order + "번째에 입력한 " + min + "입니다");
	}
}

package array;

import java.lang.*;
import java.util.Scanner;

public class Test14_array_toString {
	public static void main(String[] args) {
		// 사용자에게 7개 입력 받아서 내림차순으로 정렬 도전

		// 입력
		// int [] data = new int [7];
		// Scanner sc = new Scanner(System.in);
		// for(int i=0; i<data.length; i++) {
		// data[i] = sc.nextInt();

		// 시간 줄이기 용
		int[] data = { 5, 9, 7, 8, 1, 2, 3 };
		for (int k = data.length-1; k >= 1; k--) {
			for (int i = 0; i < k; i++) {
				if (data[i] > data[i + 1]) {
					int temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
				}
			}
		}
		// 출력
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}

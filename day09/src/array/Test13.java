package array;

import java.lang.*;
import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		// 사용자에게 7개 입력 받아서 내림차순으로 정렬 도전

		// 입력
		int [] data = new int [7]; 
		Scanner sc = new Scanner(System.in); 
		for(int i=0; i<data.length; i++) { 
			data[i] = sc.nextInt(); 
		}
		

		// 시간 줄이기 용
		//int[] data = { 5, 9, 7, 8, 1, 2, 3 };

		// int max = ~~~ 이거 말고

		for (int k = 0; k < data.length-1; k++) {
			
			int idx = k;
			for (int i = k + 1; i < data.length; i++) {
				if (data[idx] < data[i]) {
					idx = i;
				}
			}
			int temp = data[k]; // 중개사 등장
			data[k] = data[idx];
			data[idx] = temp;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}

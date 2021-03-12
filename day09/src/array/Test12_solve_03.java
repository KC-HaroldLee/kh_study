package array;

import java.lang.*;

public class Test12_solve_03 {
	public static void main(String[] args) {

		// 데이터 준비
		int[] data = new int[] { 30, 50, 20, 10, 40 };

		// 최소값을 찾아서 왼쪽과 교체하는 코드를 다음 번위에 맞게 수행
		// (1회차 : +0~+4) -> (2회차 : +1~+4) -> .... (4회차 : +3~+4)

		
		
		
		
		
		
		
		
		
		for (int k = 0; k < data.length-1; k++) { // data.length-1은 원래 4였다. 꼭 기억

			int idx = k;
			for (int i = k + 1; i < data.length; i++) {
				if (data[idx] > data[i]) {
					idx = i;
				}
			}

			int temp;
			temp = data[k];
			data[k] = data[idx];
			data[idx] = temp;

			}

		// 출력
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		
		}
	}
}

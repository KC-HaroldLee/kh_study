package array2d;

import java.lang.*;

public class Test03_02 {
	public static void main(String[] args) {
		// 문제

		int[][] data = new int[5][5];

		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 5; i++) {
				data[i][k] = (i + 1) + k * 5;
			}

		}
		
		
		// 출력
		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(data[k][i] + "\t");
				if(i==4) {
				System.out.println();
				}
			}
		}

	}
}

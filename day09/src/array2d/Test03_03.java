package array2d;

import java.lang.*;

public class Test03_03 {
	public static void main(String[] args) {
		// 문제

		int[][] data = new int[5][5];

		for (int k = 0; k < data.length; k++) {
			if (k % 2 == 0) {
				for (int i = 0; i < data[k].length; i++) {
					data[k][i] = (i + 1) + k * 5;
				}
			} 
			else {
				for (int i = data[k].length; i >= 0; i--) {
					data[k][i] = (-i + 5) + k * 5;
					
				}
			}
		}
		// 출력
		for (int k = 0; k < data.length; k++) {
			for (int i = 0; i < data[k].length; i++) {
				System.out.print(data[k][i] + "\t");
				if (i == data[k].length - 1) {
					System.out.println();
				}
			}
		}

	}
}

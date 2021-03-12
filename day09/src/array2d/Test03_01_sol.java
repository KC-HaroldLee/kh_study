package array2d;

import java.lang.*;

public class Test03_01_sol {
	public static void main(String[] args) {
		// 문제

		int[][] data = new int[5][5];
		int value = 1;
		for (int k = 0; k < data.length; k++) {
			for (int i = 0; i < data[k].length; i++) {
				//data[i][k] = (i + 1) + k * 5;
				data[i][k] = value++;
			}

		}
		
		
		// 출력
		for (int k = 0; k < data.length; k++) {
			for (int i = 0; i < data[k].length; i++) {
				System.out.print(data[k][i] + "\t");
				if(i==data[k].length-1) {
				System.out.println();
				}
			}
		}

	}
}

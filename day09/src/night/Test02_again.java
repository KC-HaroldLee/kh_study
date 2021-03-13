package night;

import java.lang.*;
import java.util.Arrays;

public class Test02_again {
	public static void main(String[] args) {
		// 최대값 찾기
		int[] data = { 10, 90, 70, 99, 65, 75, 51, 60 };

		for(int k=0; k<data.length-1; k++) {
		int idx = k;
		for (int i = k+1; i < data.length; i++)
			if (data[idx] < data[i]) {
				idx = i;
			}
		
		int temp = data[k];
		data[k] = data[idx];
		data[idx] = temp;
		}
				
		System.out.println(Arrays.toString(data));
	}
}

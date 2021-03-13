package night;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		// 최대값 찾기
		int[] data = { 10, 90, 70, 99, 65, 75, 51, 60 };

		int idx = 0;

		for (int i = 1; i < data.length; i++)
			if (data[idx] < data[i]) {
				idx = i;
			}

		System.out.println(data[idx]);
	}
}

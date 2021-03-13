package night;

import java.lang.*;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		// 내림차순
		int[] data = { 10, 90, 70, 99, 65, 75, 51, 60 };

		
		for(int i = 0; i<data.length-1; i++) {
			if(data[i]>data[i+1]) {
				int temp = data[i];
				data[i] = data[i+1];
				data[i+1] = temp;	
			}
		}
		/*
			}
		}
		if(data[1]>data[2]) {
			int temp = data[1];
			data[1] = data[2];
			data[2] = temp;		
		}
		if(data[2]>data[3]) {
			int temp = data[2];
			data[2] = data[3]];
			data[3] = temp;		
		}
		if(data[2]>data[3]) {
			int temp = data[1];
			data[1] = data[2];
			data[2] = temp;		
			
			
		
		*/
		

	}
}


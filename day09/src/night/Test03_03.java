package night;

import java.lang.*;
import java.util.Arrays;

public class Test03_03 {
	public static void main(String[] args) {
		// 내림차순
		int[] data = { 10, 90, 70, 99, 65, 75, 51, 60 };

		for(int k=0; k<data.length-2; k++) {
			for(int i = k; i<data.length-(k+1); i++) {
				if(data[i]>data[i+1]) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;	
				}
				System.out.println(Arrays.toString(data));
			}
			
			
			/*
			for(int i = 1; i<data.length-2; i++) {
				if(data[i]>data[i+1]) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;	
				}
			}
			
			for(int i = 2; i<data.length-3; i++) {
				if(data[i]>data[i+1]) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;	
				}
			}*/
	

	}
		}
	}

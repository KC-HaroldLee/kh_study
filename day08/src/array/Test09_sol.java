package array;

import java.lang.*;
import java.util.Scanner;

public class Test09_sol {
	public static void main(String[] args) {

		// 위치 찾는 것이 중요하다.
		// 사실 위치만 찾아도 값은 나온다.
		// 입력 생략
		
		// 입력
		int[] data = new int[] {30,50,10,60,20};
		//int[] data = new int[5];
		
		//1. 맨 앞 위치 (0+지점)가 가장 작은 값이라고 가정
		int idx = 0;
		
		//2. 1번부터 끝까지 반복하여 idx의 위치에 들어있는 값과 비교.
		for (int i=1; i<data.length; i++) {
		System.out.println("최소값은 " + data[idx] + ", 현재위치 " + data[i]);
		if(data[idx] > data[i]) {
			data[idx]=data[i];
			idx=i;
			
		}
		// 출력
	}
	}
	
}

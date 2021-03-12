package array;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		
		//배열에서 많이 나오는 계산 형태 : index 계산
		
		int[] data = new int [] {30, 50, 20, 10, 40};
		
		//Q. 가장 큰 값은 무었일까요?
		//A. 50, 1번 위치
		
		//인간은 왼쪽부터 훑어본다.
		//왼쪽값이 가장 크다고 가정하고 비교하며 탐색
		
		//가장 앞의 값이 크다고 생각하자
		int max = data[0];
		
		//max와 +1 +2 +3+ +4 지점을 비교한다.
		
		for(int i=1; i<=4; i++) {
			System.out.println("max = " + max + ", data = " + data[i]);
			//if (내 생각보다 더 큰 데이터를 발견했다면)
			if(max<data[i]) {
			max = data[i]; // 아 오케이 갱신된다.
		}
			
		}
		System.out.println("max = " + max); 
		
		// -------------------//
		//난 뭔 짓을 하고 있던 거여?		
		
		/*
		 * int j = 1;
		for(int i = 1; i<data.length; i++) {
			if(data[i]>data[i+j]) {
				j++;
			}
			else {
				 				
			}
		 */
		}
	}


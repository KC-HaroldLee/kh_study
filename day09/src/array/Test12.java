package array;
import java.lang.*;
public class Test12{
	public static void main(String[] args) {

		
		//데이터 준비
		int[] data = new int [] {30, 50, 20, 10, 40};
		
		
		int idx=0;
		int start=0;
		
		//1회차!
		//1. +0지점부터 마지막까지의 범위에서 가장 작은 위치를 찾아낸다.
		//2. +0지점과 가장 작은 값의 위치를 swap한다.
		
		idx = 0;
		for(int i=1; i<data.length; i++) {
			if(data[idx]>data[i]){
				idx=i;
			}
		}
		
		
		int temp;
		temp = data[0];
		data[0]= data[idx];
		data[idx] = temp;
		
		//2~4회차!
		//1. +1지점부터 마지막까지의 범위에서 가장 작은 위치를 찾아낸다.
		//2. +1지점과 가장 작은 값의 위치를 swap한다.
		
		//int idx // 위에 있음
		idx = 1;
		for(int i=2; i<data.length; i++) {
			if(data[idx]>data[i]){
				idx=i;
			}
		}
		//int temp; //위에 있음
		temp = data[1];
		data[1]= data[idx];
		data[idx] = temp;
		
		
		//출력
		for(int i =0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}

}

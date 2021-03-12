package array2d;
import java.lang.*;
public class Test02_2 {
	public static void main(String[] args) {
		//2차원 배열의 생성과 출력
		//표를 생각하자.
		
		
		
		
		//생성
		int[][]data = new int [2][3];
		
		//초기화
		data[0][0] = 9;
		data[0][1] = 6;
		data[0][2] = 4;
		
		data[1][0] = 4;
		//data[1][1] = 5;
		data[1][2] = 7;

		//변하는 숫자가 2개니까 2번 반복문
		for(int i=0; i<data[0].length; i++) {
		System.out.print(data[0][i]+"\t");
		}
		System.out.println();
		
		for(int i=0; i<data[1].length; i++) {
		System.out.print(data[0][i]+"\t");
		}
		System.out.println();

	}

}

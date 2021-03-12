package array2d;
import java.lang.*;
public class Test02_1 {
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
		
		System.out.print(data[0][0]+"\t");
		System.out.print(data[0][1]+"\t");
		System.out.print(data[0][2]+"\t");
		
		System.out.println();
		
		System.out.print(data[1][0]+"\t");
		System.out.print(data[1][1]+"\t");
		System.out.print(data[1][2]+"\t");
		
		System.out.println();
		
		/*
		System.out.print(data[2][0]+"\t");
		System.out.print(data[2][1]+"\t");
		System.out.print(data[2][2]+"\t");
		
		System.out.println();
		
		System.out.print(data[3][0]+"\t");
		System.out.print(data[3][1]+"\t");
		System.out.print(data[3][2]+"\t");
		
		System.out.println();
		*/
	}

}

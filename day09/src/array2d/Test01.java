package array2d;
import java.lang.*;
public class Test01 {
	public static void main (String[]args) {
		
		//데이터의 종류에 따라 저장하는 방법이 달라져야한다.
		//ex 학생 3명의 자바 시험점수 = 변수3개 or 배열 1개 (배열이 better)
		
		int[]a = new int [] {50, 60, 70};
		
		//ex 3개방에 각각 3명씩의 학생의 대한 자바 시험 점수를 저장

		//1차원 배열을 9칸 만들어서 3칸씩 나눠서 쓴다.
		int[]b = new int [] {50, 60, 70, 50, 60, 70, 50, 60, 70};
		//반이 구분이 안된다.
		
		
		//1차원 배열을 3칸 만들어서 3개만들어 쓴다.
		int[]c = new int [] {50, 60, 70};
		int[]d = new int [] {50, 60, 70};
		int[]e = new int [] {50, 60, 70};
		//나중에 처리가 힘들다.
		//평균을 구한다고 하면 반복문 세번씩 써야한다.
		
		//2차원 배열1개 만들어 쓴다.
		int [][]f = new int [3][3]; // 3*3
		int [][]g = new int [][] {
			{50, 60, 70},  	// [0][?]
			{50, 60, 70},	// [1][?]
			{50, 60, 70}};	// [2][?]
		
			System.out.println(g[2][2]);
			
		//그렇다면 2개 학년의 3반에 4명의 학생의 점수를 저장하려면?
		
		int [][][]h = new int [2][3][4]; //2학년, 3반, 4명
		
		
		
	}
}
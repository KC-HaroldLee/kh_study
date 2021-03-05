package data;
import java.lang.*;
public class Test08 {
	public static void main(String[]args) {
		//2과목 성적의 총점과 평균구하기
		
		//입력
		int javaScore = 90;
		int dbScore = 75;
		
		//계산
		int totalScore = javaScore + dbScore;
		double averageScore = totalScore / 2.0; //
		
		// 출력 
		System.out.println(totalScore);
		System.out.println(averageScore);
	}

}

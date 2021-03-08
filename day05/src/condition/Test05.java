package condition;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		//목표 : 다중그룹조건(이 중에 하나)
		//성적분류기
		//1. 점수를 입력받아
		//2. A 90~100 B 70~89 C 0~69,
		
		//한번의 질문으로 등급을 파악 할 수 없다.
		//두번 질문으로 해보자 
		
		System.out.println("당신의 점수를 입력해주세요 (0~100)");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		String grade;
		
		if(score>=90) {
			grade = "A";
		}
		else if(score>=70) {
			grade = "B";
		}
		else {
			grade = "C";
		}	
		
		System.out.println(score+ "점 은 " + grade + "등급입니다.");
		
		
	}
}

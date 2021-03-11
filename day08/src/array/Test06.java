package array;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		// 우리반 시험 평가 점수는
		// 50, 65, 77, 82, 90 ,90 ,59 ,72, 85 ,88
		//
		// 1. 우리반 학생들의 시험성적 평균을 구하여 출력
		// 2. 60이상인 사람은 통과, 미만인 학생들은 재시험일때
		// 재시험 인원수는?
		// 3. 80점인 학생이 추가된다면 몇등일지 예상하여 출력 (+입력으로 변경)
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("학생인원 수를 입력해주세요.");
		//int num = sc.nextInt();
		
		//int [] score = new int [num];
		int [] score = new int [] {50, 65, 77, 82, 90, 90, 59, 72, 85, 88};
		int total = 0;

		for(int i=0; i<score.length; i++) {
			//System.out.println((i+1) + "번쨰 학생 점수를 입력해주세요.");	
			//score[i] = sc.nextInt();
			total = total + score[i];
		}
		
		System.out.println(total);
		System.out.println("평균 점수 : " + (double)total/score.length); //1번 문제
		int passed = 0;
		for(int i=0; i<score.length; i++) {
			if(score [i]>=60) {
				passed +=1;
			}
			else {
				//
			}
		}
		//System.out.println("통과 인원수 "+ passed + "명");
		System.out.println("재시험 인원수 " + ((score.length)-passed) + "명"); // 2번문제
		

		
		
		// ! 아 잠깐 애초에 배열에 넣을 필요가 없네?
		
		//int oldNum=score.length-1+1; //oldNum --> 10, num --> 10.
		//num = num+1; // 배열 칸 수가 늘어나긴 하나? num--> 11
		//System.out.println(score[10]);
		
		//score[score.length] = sc.nextInt(); 이거 말고

		
		//"80"점보다 높은 사람 수 +1
		
		System.out.println("한명이 추가된다면? 몇점?");
		int newguyScore = sc.nextInt();
		int newguyRank = 0;
		for(int i=0; i < score.length; i++) {
			if(score[i] > newguyScore) {
				//System.out.println(score[i]);
				newguyRank++;
			}
		}
		
		System.out.println("방금 추가된 학생은 " + (newguyRank+1) +  "등으로 예상됩니다." );

			
	}

}
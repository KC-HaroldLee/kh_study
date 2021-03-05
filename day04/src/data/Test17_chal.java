package data;
	import java.lang.*;
import java.util.Scanner;
public class Test17_chal {
	public static void main(String[]args) {
	Scanner s = new Scanner(System.in); // 입력을 위한.
	
	//입력
	int test1, test2; // 이거밖으로 빼야하네..

	while(true) { 
		System.out.print("1번과목 점수를 입력해주세요 : ");
		
		test1 = s.nextInt();
			if(test1>100) {
				System.out.println("100점이 넘을 수 없습니다.");
			}
			else if (test1<0) {
			System.out.println("0점 아래 점수는 없습니다.");
			}
			else {
				break;
			}
	}
	System.out.println("1번 과목 점수는 " + test1 + "점입니다.");
	
	while(true) { 
		System.out.print("2번과목 점수를 입력해주세요 : ");
		
		test2 = s.nextInt();
			if(test2>100) {
				System.out.println("100점이 넘을 수 없습니다.");
			}
			else if (test2<0) {
			System.out.println("0점 아래 점수는 없습니다.");
			}
			else {
				break;
			}
	}
	
	System.out.println("2번 과목 점수는 " + test2 + "점입니다.");
	
	//계산
	boolean passFanal =  test1 >= 40 && test2 >=40 && (test1 + test2) /2 >=60;
	
	//결과
	System.out.println("통과 여부: " + passFanal);

	}
}

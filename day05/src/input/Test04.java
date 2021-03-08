package input;
	import java.lang.*;
	import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		//시간 계산기
		//사용자에게 시작시간 종료시간을 입력받아
		//이용시간을 계산하는 프로그램
		//예: 시작시간은 0900이고
		//종료시간은 1300 형태로 입력
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("시작시간을 입력해주세요 (0000형태)");
		int start = sc.nextInt();
		System.out.println("종료시간을 입력해주세요 (0000형태)");
		int end = sc.nextInt();
		sc.close();
		
		//계산
		//가장 작은 단위로 바꾼다.
		//startH, startM으로 따로따로 해도 된다.
		int startToM = (start/100*60) + start%100;
		int endToM = (end/100*60) + start%100;
		
		int takeToM = endToM - startToM;
		int takeH = takeToM/60;
		int takeM = takeToM%60;
		
		//출력
		System.out.println("이용시간은 " + takeH + "시간" + takeM + "분");
		// "이용시간은 " + ttakeToM/60 + "시간" + takeToM%60 + "분" 
		// 되긴하다.
		// 어느 것이 유지보수에 좋을까??
	
	}

}

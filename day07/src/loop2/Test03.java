package loop2;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
	//사용자에게 숫자를 입력받아 문제를 푸세요.
	//<규칙>
	//-사용자가 입력한 숫자를 누적해서 합계를 구합니다.
	//-합계가 100이 넘어가면 프로그램을 종료합니다.
	//-입력한 횟수와 입력한 값의 합계를 화면에 출력해주세요.

	Scanner sc = new Scanner(System.in);

	int num = 0;
	int count = 0;
	int total = 0;
	
	while(total <= 100) {
	System.out.println("숫자를 입력해주세요.");
	num = sc.nextInt();
		if(total + num > 100) {
			break;}
		total +=num;
			System.out.println("입력값 " + num +"누적합계 = " + total);
		}
	System.out.println("busted!");
	System.out.println(count +"회 입력");
	System.out.println(total + "에서 " + num + "을 입력하여 " + (total+num) + "이 되었습니다.");
	}
}

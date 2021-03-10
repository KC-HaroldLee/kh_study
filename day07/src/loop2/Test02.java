package loop2;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//while문이 좋은점
		//=무한반복 또는 특정시점까지의 반복
		//=0을 입력할때까지 숫자를 입력받는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //ture는 영원히 반복 (조건이 true)
		System.out.println("숫자입력(0입력시 종료)");
		int input = sc.nextInt();
		
		System.out.println("입력한 숫자는" + input);
	
	}
		//close(); //도달 할 수 없는 코드... 반복하기 때문
}
}

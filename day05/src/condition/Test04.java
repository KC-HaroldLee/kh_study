package condition;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		//문제
		//사용자에게 다음정보를 입력받아 계산
		//1. 여행을 계획중인 달 (1월~12월)
		//2. 기간(일)
		//3. 여름성수기(6,7,8월)에 여행을 가면 20% 할인 된 특가로 계산해서 화면에 출력.
		//나머지는 정상가로 계산하여 출력
		
		//(계산기준) 1일에 10만원

		System.out.println("<특가 상품> 여름 성수기 6,7,8월은 20%할인된 가격으로 모십니다.");
		System.out.println("여행을 계획 중인 달을 입력해주세요. (숫자만 입력)");
	
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		System.out.println("계획 중인 일수는 얼마나 됩니까? (숫자만 입력)");
		int days = sc.nextInt();
		sc.close();

		//계산
		
		int feeBasic = days * 10; // 단위 : 만원
		double dc;
		
		System.out.println(feeBasic);
		
		//if(month ==6 || month ==7 || month ==8)
		//if(month /3 ==2)
		if(month>=6 && month<=8) {
			dc = 80;
		} 
		else {
			dc = 100;
		}
	
		System.out.println("계획 중이신 여행 시작은 "+ month + "월입니다.");
		System.out.println("할인율은" + (int)(100-dc) + "%입니다.");
		System.out.println("예상 경비는 " + (int)(feeBasic*dc/100) + "만원 입니다.");
	}
}

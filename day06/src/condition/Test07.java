package condition;

import java.lang.*;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		/*
		 * day06 프로젝트 생성 condition 패키지 만들고 이어서 푸세요 여행사 시뮬레이션 프로그램 사용자에게 인원수, 기간, 월을 입력받아
		 * 예상경비를 계산하여 출력
		 * 
		 * <계절별 할인율> 봄 : 20% 3 4 5 여름 : 5% 6 7 8 가을 : 10% 9 10 11 겨울 : 25% 12 1 2
		 */

		// 입력
		int people;
		int days;
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수를 입력해주세요.");
		people = sc.nextInt();
		System.out.println("기간을 입력해주세요.");
		days = sc.nextInt();
		System.out.println("여행 갈 달을 입력해주세요.");
		month = sc.nextInt();
		sc.close();

		// 계산
		boolean termSpring = (month >= 3 && month <= 5);
		boolean termSummer = (month >= 6 && month <= 8);
		boolean termFall = (month >= 9 && month <= 11);
		boolean termWinter = (month == 12 && month >= 1 && month >= 2); // ? 음 오히려 확장성이 떨어지는 느낌

		/*
		 * 이것도 되긴하는데 (줄이 짧아진다는 장점 말곤 없는거 같다.) if(month >= 3 && month <=5) {
		 * dcRate=dcSpring; } else if(month >= 6 && month <=8) { dcRate=dcSummer; } ...
		 */

		/*
		 * if(month / 3 ==1){} if(month / 3 ==2){} if(month / 3 ==3){} else{}
		 */

		int dcSpring = 20;
		int dcSummer = 5;
		int dcFall = 10;
		int dcWinter = 25;

		int fareBasic = 200000;
		int fareEntire = fareBasic * people;
		int dcRate;

		if (termSpring) {
			dcRate = dcSpring;
		} else if (termSummer) {
			dcRate = dcSummer;
		} else if (termFall) {
			dcRate = dcFall;
		} else { // 어차피 남는거
			dcRate = dcWinter;
		}

		double dcRate_R = (double) (100 - dcRate) / 100;

		int discount = fareEntire * dcRate / 100;
		int result = fareEntire - discount;

		System.out.println(dcRate_R);
		// 출력
		System.out.println("예상 경비는 " + (int) (fareEntire * dcRate_R) + "원 입니다.");
		System.out.println("예상 경비는 " + (int) (result) + "원 입니다.");

	}
}

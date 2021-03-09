package condition;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		
		//입력
		int birthYear;
		int age;
		//int feeAdult = 1250; // 성인 : 20세 이상 65세 미만
		//int feeTeen = 720; // 청소년 : 14세 이상 20세 미만 
		//int feeKid = 450; // 어린이 : 8세 이상 14세 미만 
		
		//어르신 65세 이상
		//유아 8세미만
		
		System.out.println("지하철 탑승권 판매기입니다. 출생년도를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		birthYear = sc.nextInt();
		sc.close();
		
		//계산
		age = 2021 - birthYear + 1;
		
		boolean adult = age >= 20 && age < 65;
		boolean teen = age >= 14 && age < 20;
		boolean kid = age >= 8 && age < 14;
		boolean elder =  age >= 65;
		boolean infant =  age < 8;
		
	
		String target = "";
		int fee;

		if(adult) {
			target = "성인";
			fee = 1250;
		}
		else if(teen) {
			target = "청소년";
			fee = 720;
		}
		else if (kid) {
			target = "어린이";
			fee = 450;
		}
		else {
			fee = 0;
			if(elder) {
				target = "어르신";
				}
			if(infant) {
				target = "유아";
			}
		}

		//출력
		System.out.println(birthYear + "년생은 " + age + "세이며 " + target + "입니다.");
		System.out.println(target + "의 운임 요금은 " + fee + "원입니다.");
	}
}
	
}
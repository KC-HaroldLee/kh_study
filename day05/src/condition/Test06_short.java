package condition;
import java.lang.*;
import java.util.Scanner;
public class Test06_short {
	public static void main(String[] args) {
		
		//입력
		System.out.println("지하철 탑승권 판매기입니다. 출생년도를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int birthYear = sc.nextInt();
		sc.close();
		
		//계산
		int age = 2021 - birthYear + 1;
		String target = "";
		int fee;

		if(age >= 20 && age < 65) {
			target = "성인";
			fee = 1250;
		}
		else if(age >= 14 && age < 20) {
			target = "청소년";
			fee = 720;
		}
		else if (age >= 8 && age < 14) {
			target = "어린이";
			fee = 450;
		}
		else {
			fee = 0;
			if(age >= 65) {
				target = "어르신";
				}
			if(age < 8) {
				target = "유아";
			}
		}

		//출력
		System.out.println(birthYear + "년생은 " + age + "세이며 " + target + "입니다.");
		System.out.println(target + "의 운임 요금은 " + fee + "원입니다.");
	}
}

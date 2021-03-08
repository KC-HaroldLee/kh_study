package input;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		//문제 사용자에게 출생년도 4자리를 입력받아 나이와 성인여부를 판단.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생년도를 입력하세요");
		int yearInput = sc.nextInt();
		int yearCrr = 2021;
		int age = yearCrr - yearInput +1;
		
		boolean adult = age >=20;
		
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		System.out.println("성인여부 " + adult);
		sc. close();
	}
}

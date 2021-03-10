package loop3;
import java.util.*;
public class Test01_while {
	public static void main(String[] args) {
		//while로 대체
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		if (age >0 && age<150);
		System.out.println("당신의 나이는 " + age + "입니다.");
		break;
		}	
		sc.close();
	}
}

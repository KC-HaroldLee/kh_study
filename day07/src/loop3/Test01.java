package loop3;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		//do~while 반복만
		//=최초 1회 실행 후 추가 실행 여부를 확인하여 반복하는 구문
		//=ex : 사용자가 나이를 입력받는 프로그램
		//제대로 입력하면 끝내고 싶고 제대로 입력 안하면 끝내고 싶다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int age; // do가 아니면 안에 넣어도 되는데 빠짐.
		do {
		System.out.println("나이 입력");
		age = sc.nextInt();
		}
		
		while(age <=0 || age>150);

		sc.close();
		
		System.out.println("당신의 나이는 " + age + "입니다.");
	}

}

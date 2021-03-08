package condition;
import java.lang.*;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		//사용자에게 숫자를 하나 입력 받아서 홀짝판정하기
	
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나만 입력해주세요.");
		int num = sc.nextInt();
		sc.close();
		
		//계산
		boolean even = num%2 == 0; //00가 중요하다.		
		
		//출력 조건부 코드를 넣는다. {}
		if(even == true){ //역시 ==가 중요하다.
			//조건부 코드
			System.out.println(num + "은 짝수");
		}
		if(even == false){
			//조건부 코드
			System.out.println(num + "은 홀수");
		}
	}
}

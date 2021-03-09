package loop;
import java.lang.*; 
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		


		for(int i = 0; i<10; i = i+1) {
			System.out.print("숫자를 입력해보세요");
			int num = sc.nextInt();
				boolean even = (num%2==0);
				if(even) {
			System.out.println("숫자" + num + "은 짝수");
				}
				else {
				System.out.println("숫자" + num + "은 홀수");
				}
				}
		sc.close(); // 닫는건 반복문 밖으로 빼자.
	}
}

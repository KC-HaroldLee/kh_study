package loop;
import java.lang.*; 
import java.util.Scanner;
public class Test04_chal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("할일을 연속해서 입력해보세요");	
		for(int i = 0; i<10; i = i+1) {
			String doing = sc.nextLine();
				System.out.println(i+1 + "번째 아해가 " + doing + "을 하오.");
				}
		sc.close();
	}
}

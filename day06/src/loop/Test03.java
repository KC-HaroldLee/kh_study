package loop;
import java.lang.*; 
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해보세요.");
		String name = sc.nextLine();
		sc.close();
		for(int i = 0; i<5; i = i+1) {
			System.out.println("당신의 이름은 " + name);			
		}
	}
}

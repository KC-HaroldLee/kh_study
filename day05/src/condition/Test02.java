package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//사용자에게 소지금을 입력받아
		//주문 가능한 메뉴를 화면에 출력
		
		/*<메뉴판>
		 * 떡볶이		3000원
		 * 오므라이스 	7000원
		 * 자장면		5000원
		 * 치킨		15000원
		 */
	
		//입력
		String menuA = "떡볶이";
		String menuB = "오므라이스";
		String menuC = "자장면";
		String menuD = "치킨";
		
		int menuAPrice = 3000;
		int menuBPrice = 7000;
		int menuCPrice = 5000;
		int menuDPrice = 15000;
		
		System.out.println("<메뉴판>");
		System.out.println(menuA + "\t\t" + menuAPrice +"원");
		System.out.println(menuB + "\t\t" + menuBPrice +"원");
		System.out.println(menuC + "\t\t" + menuCPrice +"원");
		System.out.println(menuD + "\t\t" + menuDPrice +"원");
		System.out.println("\n");
		System.out.println("소지금을 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		sc.close();
		
		
		//출력
		System.out.println("당신이 먹을 수 있는 음식은 다음과 같습니다.");
		
		if(money>=menuAPrice) {
			System.out.println(menuA + menuAPrice +"원");
		}
		if(money>=menuBPrice) {
			System.out.println(menuB + menuBPrice +"원");
		}
		if(money>=menuCPrice) {
			System.out.println(menuC + menuCPrice +"원");
		}
		if(money>=menuDPrice) {
			System.out.println(menuD + menuDPrice +"원");
		}
		
		
		/*다른 해답
		 * boolean a = money >= 3000;
		 * boolean b = money >= 7000;
		 * boolean c = money >= 5000;
		 * boolean d = money >= 15000;
		 * 
		 * if(a) {
			System.out.println(menuA + menuAPrice +"원");
		}
		if(b) {
			System.out.println(menuB + menuBPrice +"원");
		}
		if(c) {
			System.out.println(menuC + menuCPrice +"원");
		}
		if(d) {
			System.out.println(menuD + menuDPrice +"원");
		}
		
		이렇게 해도 된다.  
		if(a==ture) 나 if(a)나 같다. 왜냐면 이미 불린값에 의한 거니까.
		 */
		
		 
		
	
		
	}

}

package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		//사용자에게 월을 입력받아 해당월이 몇일까지 있는지 보여주는(윤년무시)
		
	Scanner sc = new Scanner(System.in);
	System.out.println("월을 입력해주세요");
	int month = sc.nextInt();
	int days;
	
	
	switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :	
			days = 31;
			break;	
			
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			days = 30;
			break;	
		default :
			days = 28;
			break;
	}
			
	
	
	//출력
	System.out.println(month + "월은 " + days + "일까지 있습니다.");
	}
}

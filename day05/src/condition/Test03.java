package condition;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//그룹조건
		//동시에 실행 될 수 없는 조건
		
		int num = 9; 
		
		//계산
		
		//출력 
		//배타적인 관계에 있어서는? 이때 else를 쓴다.
		if (num%2 == 0) {
			System.out.println("짝수");
		}
		else{
			System.out.println("홀수");
		}
	}
}

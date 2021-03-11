package array;
import java.lang.*;
public class Test04_sol_3 {
	public static void main(String[] args) {
	//2. 배열에 내장된 값을 활용
	
	int [] day = new int [10];
	
	System.out.println(day.length); // 배열의 길이를 알려준다.
	
	int pushup = 10; 
	for(int i=0; i<day.length; i++) {
		// day[i] (i*3)+10 규칙을 찾기보다는 변수를 하나 더 만들자.
		day[i] = pushup;
		pushup +=3;
	}
	
	//출력
	for(int i=0; i<day.length; i++)
			System.out.println(day[i]);
	
	}
}

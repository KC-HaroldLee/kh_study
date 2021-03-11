package array;
import java.lang.*;
public class Test04_sol {
	public static void main(String[] args) {
	
	int [] day = new int [10];
	
	int pushup = 10; 
	for(int i=0; i<=9; i++) {
		// day[i] (i*3)+10 규칙을 찾기보다는 변수를 하나 더 만들자.
		day[i] = pushup;
		pushup +=3;
	}
	
	//출력
	for(int i=0; i<=9; i++)
			System.out.println(day[i]);
		
	}
}

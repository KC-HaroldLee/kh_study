package array;
import java.lang.*;
public class Test04_sol_2 {
	public static void main(String[] args) {
	//1. 칸수를 변수로 설정
	
	int period = 20;
	int [] day = new int [period];
	
	int pushup = 10; 
	for(int i=0; i<period; i++) {
		// day[i] (i*3)+10 규칙을 찾기보다는 변수를 하나 더 만들자.
		day[i] = pushup;
		pushup +=3;
	}
	
	//출력
	for(int i=0; i<period; i++)
			System.out.println(day[i]);
		
	}
}

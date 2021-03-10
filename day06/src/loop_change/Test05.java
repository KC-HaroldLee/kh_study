package loop_change;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		
		//목표 : 1부터 100사이의 홀수를 다 더란 값은 출력
		//1부터 100사이의 홀수를 화면에 출력
		//출력된 값들을 더하려면 어떻게 해야하는가?
		
		/*for(int i = 1; i<=100; i+=2) {
			System.out.println("i =" + i);
		*/
		
		int i = 1;
		while(i<=100) {
			System.out.println("i =" + i);
		i+=2;
		}
	}

}

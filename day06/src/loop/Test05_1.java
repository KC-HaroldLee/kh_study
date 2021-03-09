package loop;
import java.lang.*;
public class Test05_1 {
	public static void main(String[] args) {
		
		//만약 1부터 10까지 합계를 구해야한다면?
		//int total = 1 + 2 + ......
		
		/*int total
		 * total +=1;
		 * total +=2;
		 * total +=3;
		 * total +=4;
		 * ...
		 * total +=10;
		 */
		int total=0;

		for(int i=1; i>=10; i++) {
			total +=i;
		}
	}
}



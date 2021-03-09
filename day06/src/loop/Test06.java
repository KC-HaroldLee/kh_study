package loop;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
	//5~45 = 그룹A
	//50~55 = 그룹B
	//65~95 = 그룹C

	for(int i=1; i<=100; i+=1) {
		if (i>=50 && i<60) { 		//그룹B를 먼저 빼고
			System.out.println("i = " + i);
		}
		else if (i%10==5) {			//그룹A,C
			System.out.println("i = " + i);
			}
	
		}
	}
}	
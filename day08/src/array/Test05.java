package array;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//현명한 노인 문제를 배열을 사용하여 풀기.
		//10일간
		
		int [] pocket = new int[10];
		int coin = 1;
		int total = 0;
		int i;
		for(i=0; i<pocket.length; i++) {
			pocket[i] = coin;
			total +=coin;
			System.out.println(i+1+ "번째 날 " + coin + "원을 받음");
			coin *=2;
		}
			System.out.println("총 " + (i+1) + "일 동안 " + total + "원을 받음");
		
	}

}
